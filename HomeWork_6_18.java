package com.linghao;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-22-18:46
 */
public class HomeWork_6_18 {

    public static String checkPasswd(String password){
        if(password.length()>=8)
        {
            int length=password.length();
            int count=0;
            int count1=0;
            int count2=0;
            int count3=0;
            while(count<length) {
                if((password.charAt(count)<='9'&&password.charAt(count)>='0')||(password.charAt(count)<='Z'&&password.charAt(count)>='A')||(password.charAt(count)<='z'&&password.charAt(count)>='a'))
                    count1++;
                count++;
            }
            if(count1==length)
            {
                while(count2<length) {
                    if(password.charAt(count2)<='9'&&password.charAt(count2)>='0')
                        count3++;
                    count2++;
                }
                if(count3>=2)
                    return "valid password";
                else
                   return "invalid password";
            }
            else
                return "invalid password";

        }
        else
            return "invalid password";
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the password:");
        String password = in.next();
        System.out.println(checkPasswd(password));

    }
}
