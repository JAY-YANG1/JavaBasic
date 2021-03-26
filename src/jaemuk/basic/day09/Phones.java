package jaemuk.basic.day09;

public class Phones {
    public static void main(String[] args) {
        NormalPhone n = new NormalPhone();
        n.sendCall();

        MP3Phone m = new MP3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePicture();
    }

} // class

interface PhoneInterface {
    void sendCall();
    void receiveCall();
} // PhoneInterface

interface MP3Interface {
    void playMusic();
    void viewMovie();
} // MP3Interface

interface SmartPhoneInterface {
    void takePicture();
    void surfInternet();
    void playGame();
}


class NormalPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다");
    }
} // NormalPhone

class MP3Phone implements PhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다");
    }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void viewMovie() {
        System.out.println("영상을 재생합니다");
    }
} // MP3Phone

// 상속 extends : 부모클래스가 가진 특성과 기능을 변화없이 받음
// 구현 implements : 부모클래스가 정해준 틀에 맞춰 새롭게 작성
// 따라서, 아래처럼 짜는 것은 다소 세련되지 못함
class MP3Phone2 extends NormalPhone implements MP3Interface {
    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void viewMovie() {
        System.out.println("영상을 재생합니다");
    }
} // MP3Phone2


class SmartPhone implements PhoneInterface, SmartPhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다");
    }

    @Override
    public void takePicture() {
        System.out.println("사진을 찍습니다");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다");
    }
} // SmartPhone
