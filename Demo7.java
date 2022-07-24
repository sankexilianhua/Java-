package com.Ryson.operator;

public class Demo7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b;
        a-=b;

        System.out.println(a);

        //字符串连接符  +
        System.out.println(a+b);
        System.out.println(""+a+b);
        System.out.println(a+b+""+a+b);
        System.out.println(a+b+"");
    }
}
