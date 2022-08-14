package com.Ryson.array;

public class arrayDemo03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //打印全部元素
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
        System.out.println("==============");
        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("和为"+sum);
        System.out.println("==============");

        //查找最大元素
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大值为"+max);
    }
}
