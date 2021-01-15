package day12.demo01;

/*
* java.lang.Object类
* 类Object是类层次结构的根（最顶层）类，每个类都使用Object作为超类。
* 所有对象（包括数组）都实现这个类的方法，返回时地址，如果不想返回地址，则需要进行重写
* */
public class demo01ToString {
    public static void main(String[] args) {
        /*Person类默认继承Object类，所以可以使用Object类中的toString方法
        * String toString()返回该对象的字符串表示
        * */

        Person person=new Person("张三",10);
        String s= person.toString();

        System.out.println(s);//获取对象的地址值
        //直接打印对象的名字，其实就是调用对象的toString方法p=p.toString();
        System.out.println(person);//返回同样的地址值

        System.out.println(s.equals(person));//输出false
        System.out.println(s.equals(person.toString()));//输出true
    }
}
