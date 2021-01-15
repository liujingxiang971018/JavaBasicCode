package day19.demo02Reflection;

/*
*     获取Class类对象的方式：
        1、Class.forName("全类名")；将字节码文件加载进内存，返回Class对象
        2、类名.class：通过类名的属性class获取
        3、对象.getClass():getClass()方法在Object类中定义。
* */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "reflectDemo01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("eat...");
    }
}
