package day13.demo05;
/*
* 哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际存储的物理地址）
* 在Object类有一个方法，可以获得哈希值
* int hashCode() 返回该对象的哈希码值
* hashCode方法的源码：
*   public native int hashCode();
*   native:代表该方法调用的是本地操作系统的方法
* */
public class demo02HashCode {
    public static void main(String[] args) {
        //demo02Persion类继承了Object类，所以使用Object类的hashCode方法
        demo02Person person=new demo02Person();
        int h1=person.hashCode();
        System.out.println(h1);

        demo02Person person1=new demo02Person();
        int h2=person1.hashCode();
        System.out.println(h2);
        /*
        * toString的源码：return gerClass().getName()+"@"+Integer.toHexString(hashCode());
        * */
        System.out.println(person);//输出类名@十六进制的地址值 120960120
        System.out.println(person1);//748658608

        /*
        * String类的哈希值
        *   String类重写Object类的hashCode方法
        * */
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println(s1.equals(s2));//true
    }
}
