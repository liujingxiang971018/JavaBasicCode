package day15.demo03;

public class demo01Person {
    private String name;

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"->"+i);
        }
    }

    public demo01Person() {
    }

    public demo01Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
