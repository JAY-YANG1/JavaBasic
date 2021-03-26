package jaemuk.basic.day08;

public class Inheritance2 {
    public static void main(String[] args) {

    } // main
} // class
class People {
    String talk;
    String eat;
    String walk;
    String sleep;

} // People

class Student extends People {
    String study;
} // Student

class StudentWorker extends Student {
    String work;
} // StudentWorker

class Researcher extends People {
    String research;
} // Researcher

class Professor extends Researcher {
    String teach;
} // Professor
