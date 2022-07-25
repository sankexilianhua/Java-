package com.Ryson.Struct;

public class switchDemo02 {
    public static void main(String[] args) {
        String name = "Ryson";

        //反编译   Java---class（字节码文件）----反编译（IDEA）

        switch(name){
            case "Ryson":
                System.out.println("Ryson");
                break;
            case "true":
                System.out.println("true");
                break;
            default:
                System.out.println("弄啥嘞");
                break;
        }
    }
}
