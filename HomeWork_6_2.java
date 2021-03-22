package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-18:31
        */
public class HomeWork_6_2 {

    public static int sumDigits(long n){
        int sum=0;
        //利用循环来实现求各位数的和
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }
}
