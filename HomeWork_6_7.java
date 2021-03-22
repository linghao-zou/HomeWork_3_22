package com.linghao;

/**
 * @author zoulinghao
 * @create 2021-03-22-18:37
 */
public class HomeWork_6_7 {
    public static double futureInvestmentValue(double investmentAmount ,double monthlyInterestRate,int years){
        for(int i=1;i<=years;i++){
            for (int j=0;j<12;j++){
                investmentAmount*=(1+monthlyInterestRate);
            }
        }
        return investmentAmount;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Years             Future Value");
            System.out.printf(i+"                    %.2f\n",futureInvestmentValue(1000,0.09 / 12,i));
        }

    }
}
