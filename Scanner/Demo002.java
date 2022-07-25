package com.Ryson.Scanner;

import java.util.Scanner;

public class Demo002 {
    public static void main(String[] args) {
        
        //从键盘接受数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方法接收: ");


        if(scanner.hasNextLine()){
            String str= scanner.nextLine();
            System.out.println("输出的内容为: "+str);
        }

        scanner.close();
    }
}
