package day14.demo01;
/*
* 异常的产生过程解析：分析异常如何产生，如何处理异常
* */
public class demo02Exception {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        //访问数组中指定的索引，而数组中没有值，JVM就会检测出程序会出现异常。
        /*
        * JVM会做两件事：
        *   1、JVM会根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的内容、原因和为位置
        *   2、在gerElement方法中，没有异常的位置逻辑（try...catch），那么JVM就会把异常对象抛出给方法的调用者main()
        *
        * main方法接收到这个异常对象，main方法没有异常处理逻辑，继续把异常抛出给main方法的调用者JVM
        *
        * JVM接收到这个异常对象，做两件事
        *   1、把异常对象以红色字体打印到控制台
        *   2、JVM会终止当前正在执行的程序->中断处理
        * */
        int e=getElement(arr,arr.length);//ArrayIndexOutOfBoundsException

    }
    /*
    * 定义一个方法，获取数组指定索引处的元素
    * 参数：
    *   int[] arr;
    *   int index;
    * */
    public static int getElement(int[] arr,int index){
        int ele=arr[index];
        return ele;
    }
}
