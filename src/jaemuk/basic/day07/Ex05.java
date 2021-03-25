package jaemuk.basic.day07;

public class Ex05 {
    public static void main(String[] args) {

    } // main

    static class Fan{
        // 멤버변수
        private String speed = "SLOW";
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        // 생성자

        public Fan() {
        }

        public Fan(String speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

    }

    static class Account{
        // 멤버변수
        private String aid = "0";
        private int balance = 0;
        private double interestRate = 0;
        private String dateCreated;

        // 생성자

        public Account() {
        }

        public Account(String aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }
    }

    static class Student{
        // 멤버 변수
        private String hakBun;
        private String name;
        private String address;
        private String birth;

        // 생성자
        public Student() {
        }

        public Student(String hakBun, String name, String address, String birth) {
            this.hakBun = hakBun;
            this.name = name;
            this.address = address;
            this.birth = birth;
        }


    }

    static class Subject{
        // 멤버변수
        private String subNum;
        private String subName;
        private String subSummary;

        // 생성자
        public Subject() {
        }

        public Subject(String subNum, String subName, String subSummary) {
            this.subNum = subNum;
            this.subName = subName;
            this.subSummary = subSummary;
        }


    }

    static class Professor {
        // 매개변수
        private String profName;
        private String[] major;
        private String[] skill;


        // 생성자
        public Professor() {
        }

        public Professor(String profName, String[] major, String[] skill) {
            this.profName = profName;
            this.major = major;
            this.skill = skill;
        }


    }

    static class Major {
        // 매개변수

    }




} // class
