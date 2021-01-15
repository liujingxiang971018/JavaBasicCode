package cn.itcast.day11.demo07;

public class demoMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");

        /*//设置英雄技能
        hero.setSkill(new SkillRealize());//使用单独定义的实现类*/

        /*//使用匿名内部类
        Skill skill=new Skill() {
            @Override
            public void use() {
                System.out.println("biu");
            }
        };
        hero.setSkill(skill);*/

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu.pai");
            }
        });

        hero.attack();
    }

}
