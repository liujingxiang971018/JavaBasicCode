package day13.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型的通配符
*    ？：代表任意的数据类型
* 使用方式：
*   不能创建对象使用
*   只能作为方法的参数使用
* */
public class demo05Symbol {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("a");
        arrayList1.add("b");

        printArray(arrayList);
        printArray(arrayList1);
    }

    /*
     * 定义一个方法，能遍历所有类型的ArrayList集合
     * 这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符?来接收数据类型
     * 注意：泛型没有继承概念
     * */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
