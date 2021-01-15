package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
键盘输入一个字符串，并且统计其中各个字符出现的次数
种类有：大写字母，小写字母，数字，其他

* */
public class demo03StringCount {
    public static void main(String[] args) {
        int[] count=new int[4];//代表四种字符的个数
        Scanner scanner=new Scanner(System.in);
        //获取字符串
        String string=scanner.next();
        //将字符串转成字符数组
        char[] chars=string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A'&&chars[i]<='Z'){
                count[0]++;
            }else if(chars[i]>='a'&&chars[i]<='z'){
                count[1]++;
            }else if(chars[i]>='0'&&chars[i]<='9'){
                count[2]++;
            }else {
                count[3]++;
            }
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(count[j]);
        }
    }
}
