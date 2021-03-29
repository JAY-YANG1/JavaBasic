package jaemuk.basic.day10;

public class StarCraft2 {
    // 인터페이스 기반으로 스타크래프트 유닛을 정의
    public static void main(String[] args) {
        SCV2 s = new SCV2();

        System.out.println("SCV의 체력 " + s.hp);

        s.attack();
        s.move();
        s.specialAbility();

        Marine2 m = new Marine2();

        System.out.println(m.name + "의 체력 " + m.hp);

        m.attack();
        m.move();
        m.specialAbility();

        Firebat2 f = new Firebat2();

        System.out.println(f.name + "의 체력 " + f.hp);

        f.attack();
        f.move();
        f.specialAbility();

    } // main
} // class


class Unit2 {
    protected String name;
    protected int hp;
    protected int damage;
    protected double speed;
    protected int stone;
    protected int gas;

    public Unit2() {
    }

//    public Unit(String name, int hp, int damage, double speed, int stone, int gas) {
//        this.name = name;
//        this.hp = hp;
//        this.damage = damage;
//        this.speed = speed;
//        this.stone = stone;
//        this.gas = gas;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public double getSpeed() {
        return speed;
    }

    public int getStone() {
        return stone;
    }

    public int getGas() {
        return gas;
    }

} // Unit

// 추상클래스에서 정의해썬 추상메서드를
// 독립적인 코드들로 분리함 -> 인터페이스

interface Unit2Action {
    abstract public void attack();
    void move();        // abstract public 생략가능
    void specialAbility();
}

class SCV2 extends Unit2 implements Unit2Action {

    final String fmtattack = "이 유닛은 공격할 수 없습니다";
    final String fmtmove = "%.2f의 속도로 이동하고 있습니다\n";
    final String fmtspabty = "자원을 소모하여 기계 유닛과 건물을 수리합니다";

    public SCV2() {
        name = "건설로봇";
        hp = 45;
        damage = 0;
        speed = 2.81;
        stone = 50;
        gas = 0;
    }

    @Override
    public void attack() { System.out.println(fmtattack); }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }


} // SCV2

class Marine2 extends Unit2 implements Unit2Action {

    final String fmtattack = "가우스 소총을 이용해서 대상에게 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "%.2f의 속도로 걸어가고 있습니다\n";
    final String fmtspabty = "체력을 10 소모해 이동속도와 공격속도가 증가합니다";

    public Marine2() {
        name = "해병대";
        hp = 45;
        damage = 6;
        speed = 2.25;
        stone = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, damage);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }

} // Marine2

class Firebat2 extends Unit2 implements Unit2Action {

    final String fmtattack = "응징자유탄을 이용해 대상에게 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "%.2f의 속도로 걸어가고 있습니다\n";
    final String fmtspabty = "체력을 20 소모해 이동속도와 공격속도가 증가합니다";

    public Firebat2() {
        name = "화염방사병";
        hp = 125;
        damage = 10;
        speed = 2.25;
        stone = 100;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, damage);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }

} // Firebat2
