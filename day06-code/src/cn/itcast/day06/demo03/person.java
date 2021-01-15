package cn.itcast.day06.demo03;
/*
问题描述：定义person的年龄时，无法阻止不合理的数值被设置进来
解决方法，用private关键字，本类当中不受影响，超出类范围就不能直接访问
可以定义成员方法间接访问
* */

public class person {
    String name;
    private  int age;//定义私有成员

    public void show(){
        System.out.println(name+"+"+age);
    }
    //通过该成员方法间接设置age
    public void setage(int num){
        if(num>0&&num<100){
            age=num;
        }else {
            System.out.println("不合理");
        }

    }
    //获取age
    public int getage(){
        return age;
    }
}
