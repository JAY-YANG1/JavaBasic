package jaemuk.basic.day10;

import jaemuk.basic.sungjuk.SungJukService;
import jaemuk.basic.sungjuk.SungJukServiceImpl;
import jaemuk.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5cMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SungJukService sjsrv = new SungJukServiceImpl();
        // sjsrv 는 인스턴스 변수이므로 객체마다 개별적으로 생성됨
        // 정적변수로 만들어서 모든객체가 이것을 공유하도록 변경해야함
        // singleton 패턴을 이용해서 단일객체로만 생성되도록 제한함

        SungJukService sjsrv = SungJukServiceImpl.getInstance();
        // singleton 패턴을 이용해서 객체 생성

        String menu = "";
        SungJukVO sj = null;

        while(true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch(menu) {
                case "1" : sj = sjsrv.readSungJuk();
                           sjsrv.computeSungJuk(sj); break;
                case "2" : break;
                case "3" : sjsrv.printSungJuk(sj); break;
                case "4" : break;
                case "5" : break;
                case "0" : System.exit(0); break;
                default:
                    System.out.println("잘못입력하셨습니다!!");
            } // switch
        } //while

    } // main
} // class
