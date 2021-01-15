package cn.itcast.day05.demo01;
/*
两种常见的初始化方式
1、动态初始化（指定长度）
2、静态初始化(指定内容)
注意事项：静态初始化标准格式可以拆分成两个步骤,省略格式不能拆分
* */

/*
java的内存需要分成五个部分
1、栈（stack）：存放的都是方法中局部变量
    局部变量：方法的参数，或者是方法内部的变量
    作用于：一旦超出作用于，立刻从栈内存当中消失
2、堆（heap）：凡是new出来的东西，都是堆当中
    堆内存里面的东西都有一个地址值：16进制
    堆内存里面的数据，都有默认值。规则：
    如果是整数，默认为0
    如果是浮点数，默认为0.0
    如果是字符，默认为'\u0000'
    如果是布尔，默认为false
    如果是引用类型，默认为null
3、方法区（method area）：存储.class相关信息，包含方法的信息
4、本地方法栈：与操作系统有关
5、寄存器：与cpu有关
* */
public class demo01array {
    public static void main(String[] args) {
        int[] a=new int[300];//动态分配，默认为0
        int[] b=new int[]{1,2,3,4,5};//静态分配，标准格式，内容为1，2，3，4，5
        int[] c={1,2,3,4,5};//静态分配，省略格式
    }
}