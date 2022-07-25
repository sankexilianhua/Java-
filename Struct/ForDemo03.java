package com.Ryson.Struct;

public class ForDemo03 {
    public static void main(String[] args) {
         //用while或for输出0-1000能被5整除的数，每行3个
        for (int i = 0; i <= 1000; i++) {
           if(i%5==0){
               System.out.print(i+"\t");
           }

           if(i%(5*3)==0){
               System.out.println();
               //System.out.print("\n");
           }
        }

        int i = 0;
        int count = 0;
        while(i<=1000){
            if(i%5==0){
                System.out.print(i+"\t");
                count++;
            }
            if(count/3==1){
                count = 0;
                System.out.print("\n");
            }

            i++;
        }
    }
}
