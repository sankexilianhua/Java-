package com.Ryson.Scanner;

import java.util.Scanner;

public class Demo001 {

    public static void main(String[] args) {

        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收: ");

        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方法接收
            String str = scanner.next();
            System.out.println("输出的内容为: "+str);
        }

        scanner.close();

    }

}
