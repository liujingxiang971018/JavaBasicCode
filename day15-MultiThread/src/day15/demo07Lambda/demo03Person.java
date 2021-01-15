package day15.demo07Lambda;
/*
* 需求：
*   使用数组存储多个Person对象
*   对数组中的Person对象使用Arrays的sort方法通过年龄进行升序
* */
public class demo03Person {
    private String name;
    private int age;

    public demo03Person() {
    }

    public demo03Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "demo03Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
