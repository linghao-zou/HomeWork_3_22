package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-19:28
 */
public class HomeWork_6_5_3_4 {
    public static void main(String[] args) {
        int i=0;
        while(i <= 4){
            method1(i);
            i++;
        }
    }
    public static void method1(int i){
        do {
            if (i % 3 !=0)
                System.out.print(i+" ");
            i--;
        }while(i >= 1);
        System.out.println();
    }
}
