package cn.itcast.day08.demo03;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
* */
public class demo01static {
    public static void main(String[] args) {
        Student one=new Student("liu",12);
        one.room="101教室";//推荐下种方式。
//        Student.room="102教室";
        System.out.println(one.getId());//id=1
        Student two=new Student("sun",13);
        System.out.println(two.room);//输出：101教室
        System.out.println(two.getId());//id=2
    }
}
