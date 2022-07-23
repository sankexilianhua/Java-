package base;

public class Demo07 {

    //类变量  static
    static double salary=2500;

    //属性： 变量

    //实例变量:从属喻对象。
    String name;
    int age;

    //main 方法
    public static void main(String[] args) {

        //局部变量：必须声明和初始化值
        int i=10;
        System.out.println(i);

        //变量类型
        Demo07 demo07=new Demo07();
        System.out.println(demo07.age);

        //类变量  static
        System.out.println(salary);
    }

    //其他方法
    public void add(){

    }
}
