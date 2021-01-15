package day16.demo09SequenceStream;
/*
* 序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
* 类通过实现java.io.Serializable接口以启动其序列化功能。来实现此接口的类将无法使其任何状态序列化或反序列化
* */
/*
* transient关键字：瞬态关键字
*
* static关键字：静态关键字
*   静态优先于非静态加载到内存中（惊天优先于对象进入到内存汇总）
*   将static修饰的成员变量不能被序列化的，序列化的都是对象
* */
import java.io.Serializable;

public class person implements Serializable {
    private static final long serialVersionUID=1L;
    private int age;
//    private String name;
//    private transient String name;//使用瞬态关键字，保证修饰成员不被序列化（不能被改变），但没有static的作用
    public String name;//将修饰符改成public，序列号改变，在反序列化时将报异常InvalidException，为了保证可直接反序列化成功，固定序列号

    public person() {
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
