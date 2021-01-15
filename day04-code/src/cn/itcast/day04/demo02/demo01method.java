package cn.itcast.day04.demo02;
/*
* 定义方法，并定性方法调用*/

public class demo01method {
    public static void main(String[] args) {
        printmethod();
    }
    public static void printmethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
