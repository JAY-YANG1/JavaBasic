package jaemuk.basic.day09;

public class StarCraft {
    public static void main(String[] args) {
        //SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        // SCV 유닛을 만들때 마다 초기값을 지정하는 것은
        // 다소 번거로움
        // 즉, 동일한 속성을 가진 유닛을 만들때 마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적임
        // 이런경우, 생성자 내에서 초기값을 지정하는 것이 나음

        SCV s = new SCV();

        System.out.println("SCV의 체력 " + s.hp);

        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();

        System.out.println(m.name + "의 체력 " + m.hp);

        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();

        System.out.println(f.name + "의 체력 " + f.hp);

        f.attack();
        f.move();
        f.specialAbility();

    } // main
} // class

abstract class Unit {
    protected String name;
    protected int hp;
    protected int damage;
    protected double speed;
    protected int stone;
    protected int gas;

    public Unit() {
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

    abstract public void attack ();
    abstract public void move ();
    abstract public void specialAbility ();
} // Unit

class SCV extends Unit {

    final String fmtattack = "이 유닛은 공격할 수 없습니다";
    final String fmtmove = "%.2f의 속도로 이동하고 있습니다\n";
    final String fmtspabty = "자원을 소모하여 기계 유닛과 건물을 수리합니다";

    public SCV() {
        name = "건설로봇";
        hp = 45;
        damage = 0;
        speed = 2.81;
        stone = 50;
        gas = 0;
    }


    @Override
    public void attack() {
        // sout("융합절단기를 이용해서 ...")
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack 메서드를 유닛에 맞게 재정의함
        System.out.println(fmtattack);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, speed);
    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }

} // SCV

class Marine extends Unit {

    final String fmtattack = "가우스 소총을 이용해서 대상에게 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "%.2f의 속도로 걸어가고 있습니다\n";
    final String fmtspabty = "체력을 10 소모해 이동속도와 공격속도가 증가합니다";

    public Marine() {
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
} // Marine

class Firebat extends Unit {

    final String fmtattack = "응징자유탄을 이용해 대상에게 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "%.2f의 속도로 걸어가고 있습니다\n";
    final String fmtspabty = "체력을 20 소모해 이동속도와 공격속도가 증가합니다";

    public Firebat() {
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

} // Firebat

class Ghost extends Unit {

    public Ghost() {
        name = "유령";
        hp = 100;
        damage = 10;
        speed = 2.25;
        stone = 200;
        gas = 100;
    }

    @Override
    public void attack() {
        System.out.printf("산탄 소총을 이용해서 대상에게 %d의 피해를 주고 있습니다\n", damage);
    }

    @Override
    public void move() {
        System.out.printf("%.2f의 속도로 걸어가고 있습니다\n", speed);
    }

    @Override
    public void specialAbility() {
        System.out.println("핵미사일을 발사합니다");
    }
} // Ghost

class Sasin extends Unit {

    public Sasin() {
        name = "사신";
        hp = 50;
        damage = 4;
        speed = 2.95;
        stone = 50;
        gas = 50;
    }

    @Override
    public void attack() {
        System.out.printf("가우스 권총을 이용해서 대상에게 %d의 피해를 주고 있습니다\n", damage);
    }

    @Override
    public void move() {
        System.out.printf("%.2f의 속도로 걸어가고 있습니다\n", speed);
    }

    @Override
    public void specialAbility() {
        System.out.println("언덕 위로 뛰어오르거나 언덕 아래로 뛰어 내립니다");
    }
} // Sasin


