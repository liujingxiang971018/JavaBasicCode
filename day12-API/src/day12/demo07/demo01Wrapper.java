package day12.demo07;
/*
* 包装类：java.long包
*   基本数据类型的数据，使用起来非常的方便，但是没有对应的方法来操作这些数据
*   所以我们使用一个类，把基本类型的数据包装起来，这个类就叫包装类
*   在包装类中可以定义一些方法，用来操作基本类型的数据
*   byte->Byte
*   short->Short
*   int->Integer
*   long->Long
*   float->FLoat
*   double->Double
*   char->Character
*   boolean->Boolean
* */

/*
* 装箱：把基本类型的数据，包装到包装类中
*   构造方法：
*       Integer(int value)构造一个新分配的Integer对象，它表示指定的int值
*       Integer(String s)构造一个新分配的Integer值，它表示String参数所指示的int值
*           传递的字符串，必须是基本类型的字符串，否则会抛出异常。
*   静态方法：
*       static Integer valueOf(int i) 返回一个表示指定的int值得Integer实例
*       static Integer valueOf(String str) 返回指定的String值得Integer对象。
*
* 拆箱：在包装类中取出基本类型的数据(包装类->基本类型的数据)
*   成员方法：
*       int intValue();以int类型返回该Integer的值。
* */
public class demo01Wrapper {
    public static void main(String[] args) {
        //装箱
        Integer i=new Integer(1);//方法有横线，说明方法过时了。
        System.out.println(i);//1

        Integer i2=new Integer("1");
        System.out.println(i2);//1

        //静态方法
        Integer i3=Integer.valueOf(1);//或者“1”
        System.out.println(i3);

        //拆箱
        int i4=i3.intValue();
        System.out.println(i4);

    }
}
