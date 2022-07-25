package com.Ryson.Struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0-100之间奇数和偶数的和
        int oddSum = 0;
        int evenSum = 0;

        for(int i=0;i<=100;i+=2){
            oddSum+=i;
        }

        System.out.println("偶数之和为："+oddSum);

        System.out.println("====================");

        for(int i=1;i<=100;i+=2){
            evenSum+=i;
        }

        System.out.println("奇数之和为："+evenSum);
    }
}
