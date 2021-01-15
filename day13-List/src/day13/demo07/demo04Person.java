package day13.demo07;

import java.util.Objects;

public class demo04Person {
    private String name;
    private int age;

    public demo04Person() {
    }

    public demo04Person(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        demo04Person that = (demo04Person) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "demo04Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
