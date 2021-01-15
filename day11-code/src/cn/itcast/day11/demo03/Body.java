package cn.itcast.day11.demo03;

public class Body {//外部类
    public class heart {//内部类
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("name="+name);//正确写法
        }

    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new heart().beat();
    }
}
