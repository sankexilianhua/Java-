package com.Ryson.operator;

//逻辑运算符
public class Demo5 {
    public static void main(String[] args) {
          //与（and）  或（or）  非（取反）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b));//逻辑与：两者都为真，才为真
        System.out.println("a || b:"+(a||b));//逻辑或：两者都为假，才为假
        System.out.println("!(a && b):"+!(a&&b));//逻辑非：如果为真，则为假。如果为假，则为真。

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);

        System.out.println(c);
        System.out.println(d);
    }
}
