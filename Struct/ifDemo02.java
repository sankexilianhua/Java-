package com.Ryson.Struct;

import java.util.Scanner;

public class ifDemo02 {
    public static void main(String[] args) {
        //考试分数大于60分就及格，小于60分就不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        double d = scanner.nextDouble();

        if(d >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}
