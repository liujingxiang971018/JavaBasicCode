package day14.demo02;
/*
* 子父类的异常：
*   如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同或是父类异常的子类或者不抛出异常
*   父类方法没有抛出异常，子类重写父类该方法时不可能抛出异常，此时子类产生异常，只能捕获处理，不能声明输出
* 注意：
*   父类异常是什么样，子类异常就什么样
* */
public class demo03Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}
class Zi extends demo03Fu{
    //子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时，不抛出异常
    public void show03(){}
    //此时子类产生异常，只能捕获处理，不能声明抛出
    public void show04(){
        try{
            throw new Exception("编译器异常");
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
