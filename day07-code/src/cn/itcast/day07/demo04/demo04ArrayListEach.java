package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("liu");
        list.add("jing");
        list.add("xaing");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
