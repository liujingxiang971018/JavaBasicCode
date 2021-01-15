package cn.itcast.day09.demo03;
/*
重名问题
局部变量：   直接使用
本类的成员变量：    this.成员变量
父类的成员变量：    super.成员变量

在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找，不可能再子类中找

重写（Override）
概念：在继承关系中，方法的名称一样，参数列表也一样

重写（Override）:方法的名称一样，参数列表一样。覆盖的作用,作用：用于在继承过程中修改父类的方法以满足新的需求
重载（Overload）：方法的名称一样，参数列表不一样。

方法覆盖重写的注意事项：
1、必须保证父子类之间方法名称相同，参数列表也相同
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写
这个注解就算不写，只要满足要求，也是正确的方法覆盖重写

2、子类方法的返回值必须【小于等于】父类方法的返回值范围
Object类似所有类的公共最高父类

3、子类方法的权限必须【大于等于】父类方法的权限修饰符
权限：public>protected>(default)>private
备注：(default)不是关键字，而是什么都不写

* */
public class demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
    }
}
