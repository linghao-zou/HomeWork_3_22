package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-18:52
 */
public class HomeWork_6_26 {

    public static void main(String[] args) {
        int account=0;
        int flag=1;
        for (int i=1; ;i++){
            if (isPalindrome(i) &&isPrime(i)){
                account++;
                flag++;
                System.out.printf("%d ",i);
            }
            if (flag % 11==0){
                System.out.printf("\n");
                flag/=10;
            }
            if (account==100){

                break;
            }
        }

    }

    /**
     * 判断是否是素数
     * @param number
     * @return 如果是素数返回true 不是素数返回false
     */
    public static boolean isPrime(int number){
        if (number <2){
            return false;
        }
        int z = (int)Math.sqrt(number);
        for (int i = 2; i <= z; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否是回文数
     * @param number
     * @return 如果是回文数返回true 不是回文数返回false
     */
    public static boolean isPalindrome(int number){
        String Palindrome1=String.valueOf(number);
        String Palindrome2=new StringBuffer(Palindrome1).reverse().toString();
        if (Palindrome1.equals(Palindrome2)){
            return true;
        }
        return false;
    }


}
