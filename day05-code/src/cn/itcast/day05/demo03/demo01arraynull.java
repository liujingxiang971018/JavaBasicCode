package cn.itcast.day05.demo03;
/*
所有的引用类型变量，都可以赋值一个null值，但是代表其中什么都没有

数组必须进行new初始化才能使用其中的元素
如果只是赋值了一个null，没有进行new创建，那么将会发生空指针异常，NullPointerException

数组可以作为方法的参数
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值

* */
public class demo01arraynull {
    public static void main(String[] args) {
        int[] array=null;
        array=new int[]{1,2,3};
        System.out.println(array[1]);
        printarray(array);
    }
    public static void printarray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
