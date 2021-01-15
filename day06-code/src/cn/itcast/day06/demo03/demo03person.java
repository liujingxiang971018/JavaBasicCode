package cn.itcast.day06.demo03;

public class demo03person {
    public static void main(String[] args) {
        person one=new person();
        one.show();

        one.name="赵丽颖";
//        one.age=18;  不能直接访问
        one.setage(18);
        int age=one.getage();
        one.show();
    }
}
