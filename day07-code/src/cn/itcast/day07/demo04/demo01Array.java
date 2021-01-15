package cn.itcast.day07.demo04;

import java.util.Scanner;

/*
定义一个数组，存放3个person对象
* */
public class demo01Array {
    public static void main(String[] args) {
        person[] people=new person[3];//只是创建了数组
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
//            person one=new person();//需要创建对象
//            one.setName(scanner.next());
//            one.setAge(scanner.nextInt());
//            people[i]=one;
            //或者以下语句
            people[i]=new person();
            people[i].setName(scanner.next());
            people[i].setAge(scanner.nextInt());
        }
        for (int j = 0; j < people.length; j++) {
            System.out.println("name="+people[j].getName()+";age"+people[j].getAge());
        }

    }
}
