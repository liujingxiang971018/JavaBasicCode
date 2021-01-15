package day14.demo02;

import java.util.Scanner;

public class demo04RegisterExceptionRealize {
    static String[] usernames={"zhangsan","lisi","wangwu"};

    public static void main(String[] args) /*throws demo04RegisterException*/ {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.next();
        checkusername(username);
    }

/*    public static void checkusername(String username) throws demo04RegisterException {
        for (String name:usernames) {
            if(name.equals(username)){
                throw new demo04RegisterException("已存在");
            }
        }
        System.out.println("注册成功");//不会打印，直接弹出异常
    }*/

    public static void checkusername(String username){
        for (String name:usernames) {
            if(name.equals(username)){
                try {
                    throw new demo04RegisterException("已存在");
                } catch (demo04RegisterException e) {
                    e.printStackTrace();
                    return;//此刻位置结束
                }
            }
        }
        System.out.println("注册成功");
    }
}
