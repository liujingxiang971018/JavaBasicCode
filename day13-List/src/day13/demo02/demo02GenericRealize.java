package day13.demo02;

public class demo02GenericRealize {
    public static void main(String[] args) {
        //不写泛型，默认未Object类型
        demo02Generic gc=new demo02Generic();
        gc.setName("只能是字符串");

        Object obj=gc.getName();
        System.out.println(obj);

        //创建类对象，泛型使用Integer类型
        demo02Generic<Integer> gc2=new demo02Generic<>();
        gc2.setName(20);
        System.out.println(gc2.getName());

        //创建类对象，泛型使用Integer类型
        demo02Generic<Float> gc3=new demo02Generic<>();
        gc3.setName(20.2F);//使用float需要加F,使用long需要加L。
        System.out.println(gc3.getName());
    }
}
