package com.Ryson.method;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(f(1000));
    }

    public static int f(int n){
        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
