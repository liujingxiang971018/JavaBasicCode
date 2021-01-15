package cn.itcast.day07.demo02;
/*
创建对象的标准格式
类名称 对象名=new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
注意事项：匿名对象智能使用唯一的一次，下次再用不得不在创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
* */
public class demo01Anonymous {
    public static void main(String[] args) {
        person one=new person();
        one.name="高圆圆";
        one.showname();

        //匿名对象
        new person().name="赵又廷";

    }
}
