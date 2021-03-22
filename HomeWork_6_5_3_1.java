package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-19:21
 */
public class HomeWork_6_5_3_1 {
    public static void main(String[] args) {
        int max=0;
        max(1,2,max);
        System.out.println(max);//0

    }
    public static void max(int value1,int value2,int max){
        if (value1>value2)
            max=value1;
        else
            max=value2;
    }
}
