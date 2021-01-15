package day14.demo02;
/*
* 如果finally有return语句，永远返回finally中的结果，避免该情况。
* */
public class demo02Exception {
    public static void main(String[] args) {
        int a=getA();
        System.out.println(a);//100
    }

    private static int getA() {
        int a=0;
        try{
            return 0;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            //会执行
            a=100;
            return a;
        }
    }
}
