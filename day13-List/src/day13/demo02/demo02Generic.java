package day13.demo02;
/*
* 定义一个含有泛型的类，模拟ArrayList集合。
*
* */
public class demo02Generic<E> {//一定要加入<E>
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
