package day13.demo02;

public class demo03GenericRealize {
    public static void main(String[] args) {
        //创建对象
        demo03GenericMethod gm=new demo03GenericMethod();
        /*
        * 调用含有泛型的方法method01();
        * 传递什么类型，泛型就是什么类型
        * */
        gm.method01(10);
        gm.method01("abc");
        gm.method01('a');

        //使用静态方法
        demo03GenericMethod.method02(11);//类名.方法名
    }
}
