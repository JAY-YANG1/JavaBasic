package jaemuk.basic.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService{

    ArrayList<LibraryVO> lbdata = new ArrayList<>();
    LibraryVO lb = null;

    // 싱글톤 시작
    private static LibraryService lbsrv = null;

    private LibraryServiceImpl() {
    }

    public static LibraryService getInstance() {
        if (lbsrv == null) {
            lbsrv = new LibraryServiceImpl();
        } return lbsrv;
    }
    // 싱글톤 끝

    @Override
    public void displayMenu() {
        String displayMenu =
                "======================\n" +
                "   도서관 정보 프로그램    \n" +
                "======================\n" +
                "  1. 도서관정보 입력    \n" +
                "  2. 도서관정보 조회    \n" +
                "  3. 도서관정보 상세조회\n" +
                "  4. 도서관정보 수정    \n" +
                "  5. 도서관정보 삭제    \n" +
                "  0. 프로그램 종료      \n" +
                "----------------------\n" +
                "   작업을 선택하세요 : ";

        System.out.print(displayMenu);
    }

    @Override
    public void newLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("도서관명을 입력해주세요 : ");
        String lbname = sc.next();
        System.out.print("시도명을 입력해주세요 : ");
        String sido = sc.next();
        System.out.print("시군구명을 입력해주세요 : ");
        String gugun = sc.next();
        System.out.print("도서관유형을 입력해주세요 : ");
        String lbtype = sc.next();
        System.out.print("휴관일을 입력해주세요 : ");
        String clsday = sc.next();
        System.out.print("도로명주소를 입력해주세요 : ");
        String addr = sc.next();
        System.out.print("전화번호를 입력해주세요 : ");
        String phone = sc.next();
        System.out.print("홈페이지주소를 입력해주세요 : ");
        String homepage = sc.next();
        System.out.print("위도를 입력해주세요 : ");
        double lat = sc.nextDouble();
        System.out.print("경도를 입력해주세요 : ");
        double lon = sc.nextDouble();

        LibraryVO lb = new LibraryVO(
                lbname, sido, gugun, lbtype, clsday, addr,
                phone, homepage, lat, lon);

        lbdata.add(lb);
    }

    @Override
    public void showLibrary() {
        String fmt = "도서관명 : %s, 시도명 : %s, 시군구명 : %s, " +
                "도서관유형 : %s, 휴관일 : %s \n";
        for (LibraryVO lb : lbdata) {
            System.out.printf(fmt, lb.getLbname(), lb.getSido(), lb.getGugun(),
                    lb.getLbtype(), lb.getClsday());
        }
    }

    @Override
    public void showOneLibrary() {
        String fmt = "도서관명 : %s, 시도명 : %s, 시군구명 : %s, 도서관유형 : %s,\n" +
                "휴관일 : %s, 도로명주소 : %s, 전화번호 : %s, 홈페이지주소 : %s, \n" +
                "위도 : %f, 경도 : %f \n";

        Scanner sc = new Scanner(System.in);

        System.out.print("조회할 도서관명 : ");
        String lbname = sc.next();

        LibraryVO lb = null;
        for (LibraryVO l : lbdata) {
            if (l.getLbname().equals(lbname)) {
                lb = l;
                break;
            }
        }

        System.out.printf(fmt, lb.getLbname(), lb.getSido(), lb.getGugun(),
                lb.getLbtype(), lb.getClsday(), lb.getAddr(), lb.getPhone(),
                lb.getHomepage(), lb.getLat(), lb.getLon());
    }

    @Override
    public void modifyLibrary() {

    }

    @Override
    public void removeLibrary() {

    }
}
