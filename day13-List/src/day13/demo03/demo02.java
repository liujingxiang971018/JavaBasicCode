package day13.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
* 有序版本的斗地主案例
* 1、准备牌(每张牌需要建立索引)
* 2、洗牌
* 3、发牌
* 4、调整顺序：Collections.sort();
* 5、看牌
* */
public class demo02 {
    public static void main(String[] args) {
        //1、准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();//使用put方法添加
        //创建一个List集合，村粗牌的索引
        ArrayList<Integer> pokerindex=new ArrayList<>();

        //定义两个数组，一个数组存储花色，一个数组存储序号
        String[] colors={"红桃","黑桃","方块","梅花"};
        String[] numbers={"k","q","j","10","9","8","7","6","5","4","3","2","1"};
        //先存储大王和小王
        int index=0;
        poker.put(index,"大王");
        pokerindex.add(index);
        index++;
        poker.put(index,"小王");
        pokerindex.add(index);
        index++;

        //循环遍历两个数组
        for (String number:numbers) {
            for (String color:colors){
                poker.put(index,color+number);
                pokerindex.add(index);
                index++;
            }
        }
        /*
         * 2、洗牌：使用集合的工具类Collections中的方法shuffle(list)
         * */
        Collections.shuffle(pokerindex);
        //3、发牌
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<Integer> player1=new ArrayList<>();
        ArrayList<Integer> player2=new ArrayList<>();
        ArrayList<Integer> player3=new ArrayList<>();
        ArrayList<Integer> button=new ArrayList<>();
        /*
         * 遍历poker集合,获取索引
         * */
        for (int i=0;i<pokerindex.size();i++){
            int p=pokerindex.get(i);
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
        //4、排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(button);

        //5、看牌
        /*
        * 定义一个看牌的方法
        * 参数：String name:玩家名称，HashMap<Integer,String>poker,ArrayList<Integer> list:存储玩家和底牌的集合
        * */
        lookpoker("liujingxiang",poker,player1);
        lookpoker("sun",poker,player2);
        lookpoker("sun",poker,player3);
        lookpoker("sun",poker,button);
        /*System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(button);*/
    }
    public static void lookpoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+": ");
        for(Integer index:list){
            String value=poker.get(index);
            System.out.print(value+" ");
        }
        System.out.println();//
    }

}
/*
* 排序树：任何一个节点的左孩子节点<右孩子节点
* 平衡树：任何一个节点的左孩子与右孩子数量相差不超过1。
* 红黑树：趋近于红黑树,查询熟读非常快，查询叶子节点最大次数和最小次数不能超过2倍
*   1、节点可以是红色或者黑色的
*   2、根节点是黑色的
*   3、叶子节点（空节点）是黑色的
*   4、每个红色的节点的子节点都是黑色的
*   5、任何一个节点到其每个叶子节点的所有路径上黑色节点数相同
* */