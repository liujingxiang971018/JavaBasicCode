package day12.demo07;

import java.util.ArrayList;

/*
* 自动装箱和自动拆箱
*   基本类型的数据和包装类之间可以自动的相互转换
*   JDK1.5之后出现的新特性
*
* */
public class demo02Wrapper {
    public static void main(String[] args) {
        /*
        * 自动装箱：直接把int类型的正数赋值给包装类
        * */
        Integer i=1;//相当于Integer i=new Integer(1);

        /*
        * 自动拆箱：i是包装类，无法直接参与运算，可以自动转换为基本类型的数据，在参与运算
        * i+2;相当于i.intValue()+2=3
        * i=i+2;相当于i=new Integer(3)自动装箱
        * */
        i=i+2;

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//自动装箱，list.add(new Integer(1))
        int a=list.get(0);//自动拆箱，list.get(0).intValue();
    }
}
