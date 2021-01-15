package cn.itcast.day05.demo03;
/*
一个方法可以又0,1，多个参数；但是只能有0或者1个返回值，不能有多个返回值，
如果希望一个方法当中产生了多个结果数据进行返回，使用一个数组作为返回值。
* */
public class demo02arrayreturn {
    public static void main(String[] args) {
        int[] array=calculate(2,3,4);//接收的是地址
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;
    }
}
