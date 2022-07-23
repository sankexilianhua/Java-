package base;

public class Demo05 {
    public static void main(String[] args) {
        //操作比较大的数时，注意溢出
        //数字可以用下划线分割
        int money=10_0000_0000;
        int year=20;
        int total=money*year;
        long total2=money*year;//默认为int，转换前已经存在问题
        System.out.println(total);
        System.out.println(total2);

        long total3=money*(long)year;
        System.out.println(total3);
    }
}
