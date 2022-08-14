# Java数组

## 什么是数组

- 相同数组的有序集合
- 数组描述的是相同类型的若干个数据，按照一定先后次序排列组合而成
- 其中，每个数据称为一个数组元素，每个数组元素通过下标来访问

## 数组声明创建

- 首先必须声明数组变量，才能在程序中使用数组。

- 声明数组变量的语法：

  ```java
  dataType[] arrayRefVar  (首选)
      或
  dataType  arrayRefVar[]
  ```

- Java语言使用new操作符来创建数组

  ```java
  dataType[] arrayRefVar = new dataType[arraySize];
  ```

- 数组元素通过索引访问，索引从0开始
- 获取数组长度：array.length

## 内存分析

### 堆

- 可以存放new的对象和数组
- 可以被所有的线程共享，不会存放别的对象引用

### 栈

- 存放基本变量类型（会包含这个基本类型的具体数值）
- 引用对象的变量（会存放这个引用在堆里面的具体地址）

### 方法区

- 可以被所有线程共享
- 包含了所有class和static变量

## 三种初始化

### 静态初始化

```java
//静态初始化，创建+赋值
int[] a = {1,2,3,4,5,6,7,8,9};
```



### 动态初始化

```java
//动态初始化：包含默认初始化
int[] a = new int[10];
```

一般动态初始化完，默认为0

## 数组的四个基本特点

- 其长度是确定的。数组一旦被创建，它的大小就是不可以改变的
- 其元素必须是相同类型，不允许出现混合类型
- 数组中的元素可以是任何数据类型，包括基本类型和引用类型
- 数组变量属引用类型，数组也可以看成对象，数组中的每个元素可以看作该对象的成员变量
- 数组对象本身在堆中

## 数组的使用

### For-Each循环

```java
int[] arrays = {1,2,3,4,5};
for(int i=0;i<5;i++){
    .....;
}

for(int array:arrays){
    ......;
}
```



### 数组作方法入参,作为返回值

```java
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

    int[] array = {1,2,3,4,5};
    int[] reverse = reverse(array);
    printArray(reverse);
```



## 二维数组

多维数组可以看作是数组的数组，比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组

```java
int[][] arraye = {{1,2},{2,3},{3,4},{4,5}};
```

##  Array类

- 数组工具类 java.util.Arrays
- Arrays类中方法都是static修饰的静态方法，在使用时可以直接使用类名进行调用，而不用使用对象来调用

- 以下功能：
  - 给数组赋值：使用fill方法
  - 对数组排序：通过sort方法，按升序
  - 比较数组：通过equals方法比较数组中元素值是否相等
  - 查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找操作

## 冒泡排序

```java
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {//要走多少趟

            boolean flag = true;

            for(int j=0; j < array.length-1-i;j++){//每次的比较
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
```

先确定要走多少趟，然后再进行比较

### 稀疏数组

- 当一个数组中大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来保存该数组
- 稀疏数组的处理方式是：
  - 记录数组共有几行几列，有多少个不同值
  - 把具有不同值的元素及行列记录在一个小规模的数组中，从而缩小程序的规模

```java
    public static void main(String[] args) {
        //1,创建一个二维数组 11*11 0：没有棋子 1：黑棋 2：白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 1;

        System.out.println("输出原始的数组");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        //转换为稀疏数组保存
        //获取有效值的个数
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数："+sum);

        //2，创建一个稀疏数组
        int[][] array2 = new int[sum+1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非零的值，存放稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }

        //输出稀疏数组
        System.out.println("稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"
            +array2[i][1]+"\t"
            +array2[i][2]+"\t");
        }

        System.out.println("================");
        System.out.println("还原");
        //1.读取稀疏数组的值
         int[][] array3 = new int[array2[0][0]][array2[0][1]];

         //2，还原值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        //3,打印
        System.out.println("输出还原的数组");

        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
```

