package cn.itcast.day11.demo06;

public class Weapon {
    private String code;//名字
    private int ability;//

    public Weapon() {
    }

    public Weapon(String code, int ability) {
        this.code = code;
        this.ability = ability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }
}
