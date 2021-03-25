package jaemuk.basic.day08;

public class Book {
    private String title;
    private String writer;
    private String writer2;
    private String writer3;
    private String date;
    private int price;
    private int cPrice;
    private double interestRate;
    private int jukLip;

    public Book(String title, String writer, String writer2, String writer3,
                String date, int price, double interestRate) {
        this.title = title;
        this.writer = writer;
        this.writer2 = writer2;
        this.writer3 = writer3;
        this.date = date;
        this.price = price;
        this.interestRate = interestRate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setWriter2(String writer2) {
        this.writer2 = writer2;
    }

    public void setWriter3(String writer3) {
        this.writer3 = writer3;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setcPrice(int cPrice) {
        this.cPrice = cPrice;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setJukLip(int jukLip) {
        this.jukLip = jukLip;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getWriter2() {
        return writer2;
    }

    public String getWriter3() {
        return writer3;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public int getcPrice() {
        return cPrice;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getJukLip() {
        return jukLip;
    }
}