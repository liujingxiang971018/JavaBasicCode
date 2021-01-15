package cn.itcast.day08.demo03;

public class Student {
    private int id;//使其自动生成
    private String name;
    private int age;
    static String room;//代表教室，多个对象共享同一份数据
    static int idCounter=0;

    public Student() {
        this.id=++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}