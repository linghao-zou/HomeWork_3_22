package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-19:23
 */
public class HomeWork_6_5_3_2 {
    public static void main(String[] args) {
        int i=1;
        while(i <= 6){
            method1(i,2);
            i++;
        }
//        2
//        24
//        248
//        24816
//        2481632
//        248163264
    }

    public static void method1(int i,int num){
        for (int j = 1; j <= i; j++) {
            System.out.print(num+"");
            num *=2;
        }
        System.out.println();
    }
}
