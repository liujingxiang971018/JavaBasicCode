package day19.demo02Reflection;

public class demo01Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Class.getName("全类名")
        Class cls=Class.forName("day19.demo02Reflection.Person");
        System.out.println(cls);//class day19.demo02Reflection.Person
        //2、类名.class
        Class cls2=Person.class;
        System.out.println(cls2);//class day19.demo02Reflection.Person
        //3、对象.getClass()
        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);//class day19.demo02Reflection.Person
    }
}
