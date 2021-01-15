package day18.function;
/*
* 函数式接口的使用：一般作用方法的参数和返回值类型
* */
public class demo01 {
    //参数是一个接口对象
    public static void show(demo01interface inter){
        inter.show();
    }

    public static void main(String[] args) {
        //方法1
        show(new demo01function());
        //方法2
        show(new demo01interface() {
            @Override
            public void show() {
                System.out.println("直接重写");
            }
        });
    }
}
