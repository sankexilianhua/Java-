package com.Ryson.array;

public class arrayDemo02 {

    public static void main(String[] args) {

        //静态初始化
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(a[0]);

        //Man[] man = {new Man(),new Man()};

        //动态初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[10]);
    }
}
