package com.Ryson.operator;

//三元运算符
public class Demo8 {
    public static void main(String[] args) {
        // x ? y : z
        //若x为真，则结果为y，否则为z

        int score = 80;
        String type = score < 60? "不及格" : "及格";
        System.out.println(type);
    }
}
