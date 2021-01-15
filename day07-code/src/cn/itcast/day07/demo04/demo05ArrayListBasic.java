package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
如果希望向集合中存放基本类型数据，必须使用基本类型对应的“包装类
基本类型    包装类（应用类型，位于java.lang包下）
byte    Byte
short   Short
int     Integer
long    Long
float   Float
double  Double
char    Character
boolean Boolean

从JDK1.5开始，支持自动装箱，自动拆箱
自动装箱：基本类型-->包装类型
自动拆箱：包装类型-->基本类型

* */
public class demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();

        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(1,50);
        System.out.println(listB);
    }
}
