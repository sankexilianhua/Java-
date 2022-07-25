package com.Ryson.Scanner;

import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {

        //我们可以输入多个数字，求其总和和平均数，每输入一个数字用回车确定，通过输入非数字来结束输入并输出结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m++;

            sum+=x;

            System.out.println("你输入了第"+m+"个数据，当前结果sum="+sum);
        }

        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"个数的平均数为："+sum/m);

        scanner.close();

    }
}
