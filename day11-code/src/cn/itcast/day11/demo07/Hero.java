package cn.itcast.day11.demo07;

//使用接口作为参数类型

public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(){
        System.out.println("name="+name+"使用技能:");
        skill.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}