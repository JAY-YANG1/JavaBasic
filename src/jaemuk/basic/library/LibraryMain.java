package jaemuk.basic.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryService lbsrv = LibraryServiceImpl.getInstance();

        Scanner sc = new Scanner(System.in);

        String menu = "";

        while(true) {
            lbsrv.displayMenu();
            menu = sc.next();

            switch(menu) {
                case "1" : lbsrv.newLibrary(); break;
                case "2" : lbsrv.showLibrary(); break;
                case "3" : lbsrv.showOneLibrary(); break;
                case "4" : lbsrv.modifyLibrary(); break;
                case "5" : lbsrv.removeLibrary(); break;
                case "0" : System.exit(0); break;
                default:
                    System.out.println("잘못입력하셨습니다!!");
            } // switch
        } // while

    } // main
} // class
