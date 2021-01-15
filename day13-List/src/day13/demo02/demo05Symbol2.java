package day13.demo02;

import java.util.ArrayList;
import java.util.Collection;

/*
高级使用：限定使用的数据类型
* 泛型的上限限定：？ extends E   代表使用的泛型只能是E类型的子类/本身
* 泛型的下限限定：？ super E     代表使用的泛型只能是E类型的父类/本身
* */
public class demo05Symbol2 {
    public static void main(String[] args) {
        Collection<Integer> collection1=new ArrayList<Integer>();
        Collection<String> collection2=new ArrayList<String>();
        Collection<Number> collection3=new ArrayList<Number>();
        Collection<Object> collection4=new ArrayList<Object>();

        //下限：必须是Number本身或其父类
//        getElement1(collection1);//报错
//        getElement1(collection2);//报错
        getElement1(collection3);
        getElement1(collection4);
        //上限，必须是Number本身或其子类
        getElement2(collection1);
//        getElement2(collection2);//报错
        getElement2(collection3);
//        getElement2(collection4);//报错

        /*
        * 类与类之间的继承关系
        * Integer extends Number extends Object
        * String extends Object
        * */
    }

    //泛型的上限：此时的泛型？，必须是Number类型或者Number类型的子类
    private static void getElement2(Collection<? extends Number> collection) {
    }
    //泛型的下限：此时的泛型？，必须是Number类型或者Number类型的父类
    private static void getElement1(Collection<? super Number> collection) {
    }
}
