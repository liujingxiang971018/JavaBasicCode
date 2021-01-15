package day12.demo05;
/*
* java.long.System:提供大量静态方法
*   public static long currentTimeMillis():返回以毫秒为单位的当前时间
*   public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int Length);将数组中指定的数据拷贝到另一个数组中
*
* */
public class demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    //数组赋值：arraycopy();
    private static void demo02() {
        int[] a={1,2,3,4,5};
        int[] b=new int[10];
        //从a数组中索引为2的地方开始复制三个元素到b数组，索引为0的位置开始
        System.arraycopy(a,2,b,0,3);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    //测试程序的执行时间
    private static void demo01() {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print(i);
        }
        long endTime=System.currentTimeMillis();
        long time=endTime-startTime;
        System.out.println("总共执行时间："+time);
    }
}
