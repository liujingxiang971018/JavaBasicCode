package day13.demo06;
/*
* Person类，用来辅助自定义类型排序
* */
public class demo02Person implements Comparable<demo02Person>{
    private String name;
    private int age;

    public demo02Person() {
    }

    public demo02Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "demo02Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    //重写排序规则
    @Override
    public int compareTo(demo02Person demo02Person) {
//        return 0; //0：认为元素都是相同的
        //自定义比较规则：比较两个人的年龄（this.age）
        return this.getAge()-demo02Person.getAge();
    }
}
