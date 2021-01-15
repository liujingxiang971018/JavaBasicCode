package day15.demo07Lambda;
/*
* 无参数无返回值
* */
public class demo02Lambda {
    public static void main(String[] args) {
        invokecook(new cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda表达式
        invokecook(()->{
            System.out.println("吃饭");
        });
    }

    //定义一个方法，参数传递cook接口，方法内部调用cook接口中的方法makefood
    public static void invokecook(cook cook){
        cook.makefood();
    }
}
