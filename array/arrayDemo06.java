package com.Ryson.array;

import java.util.Arrays;

public class arrayDemo06 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,8,6,9,7,5};
        System.out.println(a);//[I@1b6d3586

        //打印数组元素
        //System.out.println(Arrays.toString(a));
        //printArray(a);
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print("[");
            }else if(i==a.length-1){
                System.out.print(a[i]+"]");
            }else{
                System.out.print(a[i]+",");
            }
        }
    }
}
