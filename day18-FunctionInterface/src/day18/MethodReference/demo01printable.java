package day18.MethodReference;

public class demo01printable {
    public static void printString(printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
/*        printString(s -> {
            System.out.println(s);
        });*/
/*        printString(new printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        });*/

        printString(System.out::println);//正确输出
    }
    /*
    * 分析：
    *   lambda表达式的目的,打印参数传递的字符串
    *   把参数s，传递给了system.out对象
    *
    *   类名::方法(也可以类名.方法)
    *   对象.方法
    * */
}
