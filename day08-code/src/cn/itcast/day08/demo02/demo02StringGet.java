package cn.itcast.day08.demo02;
/*
String当中与获取相关的常用方法：

public int length();
public String concat(String str);将当前字符串和参数字符串拼接成返回值新的字符串
public char charAt(int index);获取指定索引位置的单个字符
public int indexof(String str);查找参数字符串在本字符串当中首次出现的索引位置，如果没有则返回-1.

字符串的截取方法
public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end);截取从begin开始，到end结尾中间的字符串
备注：[begin,end):包含左边，不包含右边


String当中与转换相关的常用方法
public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes();获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString);将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
CharSequence:其实就是字符串

String分割字符串
public String[] split(String regix);按照参数的规则，将字符串切分成若干部分
注意事项：
split方法的参数其实是一个正则表达式，如果按照"."进行切分，则需要写成"\\."。
* */
public class demo02StringGet {
    public static void main(String[] args) {
        String str1="123";
        String str2="456";
        String str3=str1.concat(str2);//创建新的字符串
        System.out.println(str1+"  "+str2+" "+str3);
        System.out.println(str3.charAt(0)+" "+str3.indexOf(str1));

        String str4=str1.substring(0);
        System.out.println(str4);//输出123
        String str5=str1.substring(0,1);
        System.out.println(str5);//输出1


        char[] chars=str3.toCharArray();//转成字符数组
        System.out.println(chars.length);
        byte[] bytes=str3.getBytes();//转成字节数组
        System.out.println(bytes.length);
        String str6="how do you do";
        String str7=str6.replace("how","why");
        String str8=str6.replace("o","*");
        System.out.println(str7);
        System.out.println(str8);

        String[] strings=str6.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);//how,do,you,do
        }
    }
}
