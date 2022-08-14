package com.Ryson.array;

import java.util.Arrays;

public class arrayDemo07 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,8,6,9,7,5};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    //冒泡排序
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {

            boolean flag = true;

            for(int j=0; j < array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }

            if(flag){
                break;
            }
        }
    }
}
