package jaemuk.basic.sungjuk;

public class SungJukVO {

    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected char grd;

    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    // setter

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    // getter

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public int getTot() {
        return tot;
    }

    public double getAvg() {
        return avg;
    }

    public char getGrd() {
        return grd;
    }

} // class
