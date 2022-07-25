package com.Ryson.Struct;

public class ForDemo01 {
    public static void main(String[] args) {
         int a = 1;//初始化条件

         while(a<=100){//条件判断
             System.out.println(a);
             a+=2;//迭代
         }

        System.out.println("while循环结束！");

         for(int i=1;i<=100;i+=2){
             System.out.println(i);
         }
        System.out.println("for循环结束！");
    }


}
