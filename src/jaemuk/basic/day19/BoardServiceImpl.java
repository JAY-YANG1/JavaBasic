package jaemuk.basic.day19;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BoardServiceImpl implements BoardService {

    // 싱글톤 패턴 시작
    private static BoardDAO bdao;
    private static BoardService bsrv = null;

    private BoardServiceImpl() {
        bdao = BoardDAOImpl.getInstance();
    }

    public static BoardService getInstance() {
        if (bsrv == null) {
            bsrv = new BoardServiceImpl();
        } return bsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 : ");
        String userid = sc.nextLine();
        System.out.print("제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("본문을 입력해주세요 : ");
        String contents = sc.nextLine();

        BoardVO bvo = new BoardVO(null, title, userid, null,
                null, null, contents);

        int cnt = bdao.insertBoard(bvo);
        if (cnt > 0) {
            System.out.println("새로운 글이 등록되었습니다");
        }

    }

    @Override
    public void readBoard() {
        String fmt = "%s %s %s %s %s %s \n";

        ArrayList<BoardVO> bdlist = (ArrayList<BoardVO>) bdao.selectBoard();

        StringBuffer sb = new StringBuffer();
        for(BoardVO b : bdlist) {
            String result = String.format(fmt, b.getBdno(), b.getTitle(), b.getUserid(),
                    b.getRegdate(), b.getViews(), b.getThumbup());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    @Override
    public void readOneBoard() {
        String fmt = "%s %s %s %s %s %s %s\n";
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 게시물 번호를 입력하세요 : ");
        int bdno = sc.nextInt();

        BoardVO b = bdao.selectOneBoard(bdno);
        String result = String.format(fmt, b.getBdno(), b.getTitle(),
                b.getUserid(), b.getRegdate(), b.getViews(),
                b.getThumbup(), b.getContents());

        System.out.println(result);

        System.out.println("이 게시물을 추천하시겠습니까? (y/n) : ");
        String thumbup = sc.next();
        if (thumbup.toLowerCase().equals("y")) {
            bdao.thumbupBoard(bdno);    // 본문글 추천하기
        }
    }

    @Override
    public void modifyBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 게시글 번호를 입력해주세요 : ");
        String bdno = sc.nextLine();
        System.out.print("변경된 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("변경된 본문을 입력해주세요 : ");
        String contents = sc.nextLine();

        BoardVO bvo  = new BoardVO(bdno, title, null, null,
                null, null, contents);

        int cnt = bdao.updateBoard(bvo);
        if (cnt > 0) {
            System.out.println("수정 완료!!");
        }
    }

    @Override
    public void removeBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 게시글 번호를 입력해주세요 : ");
        int bdno = Integer.parseInt(sc.next());

        int cnt = bdao.deleteBoard(bdno);
        if (cnt > 0) {
            System.out.println("삭제 완료!");
        }
    }
}
