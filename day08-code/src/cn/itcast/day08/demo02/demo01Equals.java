package cn.itcast.day08.demo02;
/*
--是对象的地址值比较，如果确实需要字符串的内容标记哦，可以使用两个方法

public boolean equals(Object obj);参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false
备注：
1、任何对象都能用Object进行接收
2、如果比较双方一个常量一个变量，推荐常量放在前面，变量放在equals()中。即"abc".equals(str);

public boolean equalsIgnoreCase(Object obj);忽略大小写
* */
public class demo01Equals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] chars={'h','e','l','l','o'};
        String str3=new String(chars);

        System.out.println(str1.equals(str3));//true
    }
}
