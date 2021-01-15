package cn.itcast.day11.demo06;

public class demoMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("盖伦");
        hero.setAge(19);

        Weapon weapon=new Weapon("多兰剑",180);
        hero.setWeapon(weapon);
        hero.attack();
    }
}
