package com.Ryson.array;

public class arrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
//
//        for (int i : arrays) {
//            System.out.println(i );
//        }
       // printArray(arrays);
       int[] reverse = reverse(arrays);
       printArray(reverse);
    }
    //打印数组
    public  static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    //反转数组
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        //反转的操作
        for (int i = 0,j= result.length-1; i < array.length; i++,j--) {
            result[j]=array[i];
        }

        return result;
    }
}
