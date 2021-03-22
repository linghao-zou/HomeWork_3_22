package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-19:31
 */
public class HomeWork_6_7_3 {
    public static void main(String[] args) {
        System.out.println(hexToDecimal("A9"));//169
    }

    public static int hexToDecimal(String hex){
        int decimalValue=0;
        for (int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if (ch >= 'A' && ch<= 'F')
            return 10+ch-'A';
        return ch-'0';
    }
}
