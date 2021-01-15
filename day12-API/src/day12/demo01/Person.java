package day12.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    * 直接打印对象的地址值没有意义，需要重写Object类的toString方法
    * */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    * Object类的equals方法默认比较的是两个对象的地址值，没有意义
    * 所以需要重写equals方法，比较两个对象的属性值
    *   对象的属性值一样则返回true，否则返回false
    * 问题：
    *   隐含着一个多态
    *   Object obj=new Person("liu",11);
    *   多态弊端：无法使用子类特有的内容
    *   解决：使用向下转型
    * */
  /*  @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            //使用向下转型
            Person person=(Person)obj;
            boolean b=this.name.equals(person.name)&&this.age== person.age;
            return b;
        }
        return false;
    }*/
    //  快捷键生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);//Objects.equals(str1,str2),进行相等判断，其中增加了健壮性判断，容忍空指针
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
