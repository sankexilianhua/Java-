package com.Ryson.operator;

public class Demo4 {
    public static void main(String[] args) {
        //++ -- 自增  自减   一元运算符
        int a = 3;

        int b = a++;
        int c = ++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算  2^3  2*2*2=8   很多运算会使用工具类来操作！
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
