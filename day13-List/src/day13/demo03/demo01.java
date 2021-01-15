package day13.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
* 斗地主案例
* 1、准备牌，存储到一个集合中
* 特殊牌：大王和小王
* 其他牌：
*   定义一个数组/集合，存储四种花色
*   定义一个数组/集合，存储13个序号
* 循环嵌套遍历两个数组/集合，组装52张牌
* 2、洗牌
*   使用集合工具类Collections的方法：
*       static void shuffle(List<?> list)使用指定的随机源对指定列表进行置换
* 3、发牌
*   要求：1人17张，剩余3张作为底牌，一人一张轮流发牌：集合的索引（0-53）%3
*   定义4个集合，存储3个玩家的牌和底牌
* 4、看牌
*   直接打印
* */
public class demo01 {
    public static void main(String[] args) {
        //1、准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组，一个数组存储花色，一个数组存储序号
        String[] colors={"红桃","黑桃","方块","梅花"};
        String[] numbers={"k","q","j","10","9","8","7","6","5","4","3","2","1"};
        //先存储大王和小王
        poker.add("大王");
        poker.add("小王");
        //循环遍历两个数组
        for (String number:numbers) {
            for (String color:colors){
                poker.add(color+number);
            }
        }
        /*
        * 2、洗牌：使用集合的工具类Collections中的方法shuffle(list)
        * */
        Collections.shuffle(poker);
        //3、发牌
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> button=new ArrayList<>();
        /*
        * 边际poker集合
        * */
        for (int i=0;i<poker.size();i++){
            String p=poker.get(i);
            if(i>=51){
                button.add(p);
            }
            else if(i%3==0){
                player1.add(p);
            }else if(i%3==1){
                player2.add(p);
            }else {
                player3.add(p);
            }
        }

        //4、看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(button);
    }
}
