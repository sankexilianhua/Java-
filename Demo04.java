package base;

public class Demo04 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;

        System.out.println(i);
        System.out.println(b);
        System.out.println("===================");

        System.out.println((int)23.7);
        System.out.println((int)-45.78f);
        System.out.println("===================");

        char c='a';
        int d=c+1;
        System.out.println(d);
        System.out.println((char)d);
    }
}
