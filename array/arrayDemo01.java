package com.Ryson.array;

public class arrayDemo01 {
    public static void main(String[] args) {
        int[] nums;//声明一个数组

        nums = new int[10];

        //给数组中元素赋值
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 5;
        nums[6] = 6;
        nums[7] = 7;
        nums[8] = 8;
        nums[9] = 9;

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
    }
}
