package base;

public class Demo03 {
    public static void main(String[] args) {
       //整数拓展  进制   二进制0b  十进制  八进制  十六进制
        int i=10;
        int i2=010;
        int i3=0x10;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=====================");

        //浮点数拓展
        float f=0.1F;
        double d=1.0/10;
        System.out.println(f==d);

        float f2=31223413342432f;
        float f3=f2+1;
        System.out.println(f2==f3);
        System.out.println("=====================");

        //字符拓展
        char c1='a';
        char c2='中';

        System.out.println(c1);
        System.out.println((int)c1);//强制类型转换
        System.out.println(c2);
        System.out.println((int)c2);//强制类型转换

        //所有字符本质还是数字
        //编码  unicode 有表 2字节  0-65536
        char c3='\u0061';
        System.out.println(c3);//a
        System.out.println("=====================");

        String sa=new String("Hello World!");
        String sb=new String("Hello World!");
        System.out.println(sa==sb);

        String sc="Hello World!";
        String sd="Hello World!";
        System.out.println(sc==sd);
        System.out.println("=====================");

        //布尔值拓展
        boolean flag=true;

        if(flag){
            ;
        }
    }
}
