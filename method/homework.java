package com.Ryson.method;

import java.util.Scanner;

//实现一个简易计算器
public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("*****欢迎使用计算器*****");
            System.out.println("****1,加法  2，减法****");
            System.out.println("****3,乘法  4，除法****");
            System.out.println("****    5,退出    ****");
            System.out.println("****请选择要使用的功能***");

            int i = scanner.nextInt();
            if(i==5){
                System.out.println("退出计算器");
                break;
            }
            System.out.println("请输入两个数字：");
            double num1= scanner.nextDouble(), num2=scanner.nextDouble();

            switch (i){
                case 1:
                    System.out.println("结果是："+add(num1,num2));
                    break;
                case 2:
                    System.out.println("结果是："+sub(num1,num2));
                    break;
                case 3:
                    System.out.println("结果是："+mul(num1,num2));
                    break;
                case 4:
                    System.out.println("结果是："+div(num1,num2));
                    break;
                default:
                    System.out.println("输入有误");
            }

        }

        scanner.close();
    }

    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double sub(double num1,double num2){
        return num1-num2;
    }
    public static double mul(double num1,double num2){
        return num1*num2;
    }
    public static double div(double num1,double num2){
        if(num2==0){
            System.out.println("输入有误");
            return 0;
        }

        return num1/num2;
    }
}
