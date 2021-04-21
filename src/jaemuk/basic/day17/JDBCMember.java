package jaemuk.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC로 구현
        // 테이블명 : NMember (playground)
        // 테이블 컬럼 구성 : 아이디(userid), 비밀번호(passwd), 이름(name), 성별(gender)
        //                  생년월일(birth), 이메일(email), 휴대전화(hp)
        // 자동입력 컬럼 : 회원번호(mbno), 가입일(regdate)

        // 회원가입 테이블 생성 테스트
//        create table NMember (
//                mbno int auto_increment primary key,
//                userid varchar(18) not null,
//                passwd varchar(18) not null,\n
//                name varchar(10) not null,\n
//                birth varchar(10) not null,\n
//                gender int not null,\n
//                email varchar(50) not null,\n
//                hp varchar(15) not null,\n
//                regdate datetime default current_timestamp \n
//                );

        // 데이터 삽입 테스트
//        insert into NMember (userid, passwd, name, birth, gender, email, hp)
//        values (?,?,?,?,?,?,?);

        // 데이터 조회 테스트
//        select mbno, userid, name, regdate,  from NMember
//        order by mbno desc;

        // 데이터 상세조회 테스트
//        select * from NMember where mbno = 1;

        // 데이터 수정 테스트
//        update NMember
//        set name = '전지현',
//        birth = '2020-04-21;, hp = '010-6789-1234'
//        where mbno = 1;

        // 데이터 삭제 테스트
//        delete from NMemeber
//        where mbno = 1;

        MariaJDBC jdbc = new MariaJDBC();

        // 회원가입 테이블 생성
        String sql = "create table NMember (\n" +
                "mbno int auto_increment primary key,\n" +
                "userid varchar(18) not null,\n" +
                "passwd varchar(18) not null,\n" +
                "name varchar(10) not null,\n" +
                "birth varchar(10) not null,\n" +
                "gender int not null,\n" +
                "email varchar(50) not null,\n" +
                "hp varchar(15) not null,\n" +
                "regdate datetime default current_timestamp \n" +
                ")";

        try (
                Connection conn = jdbc.openConn();
                Statement stmt = conn.createStatement();
        ) {
            boolean isOk = stmt.execute(sql);
            if (isOk) {
                System.out.println("테이블 생성 완료");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("이미 존재하는 테이블이거나 시스템 오류 입니다");
        }

        // 회원가입 정보 입력
        sql = " insert into NMember (userid, passwd, name, birth, gender, email, hp) " +
                " values (?,?,?,?,?,?,?) ";

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 : ");
        String userid = sc.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        String passwd = sc.next();
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.print("생년월일을 입력해주세요 : ");
        String birth = sc.next();
        System.out.print("성별을 입력해주세요 : ");
        int gender = Integer.parseInt(sc.next());
        System.out.print("이메일을 입력해주세요 : ");
        String email = sc.next();
        System.out.print("전화번호를을 입력해주세요 : ");
        String hp = sc.next();

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {
            pstmt.setString(1, userid);
            pstmt.setString(2, passwd);
            pstmt.setString(3, name);
            pstmt.setString(4, birth);
            pstmt.setInt(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, hp);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("회원 추가 완료");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 회원가입 완료 후 지금까지 가입한 모든 회원조회
        // 조회대상 컬럼 : 회원번호, 아이디, 이름, 가입일

        sql = "select mbno, userid, name, date(regdate) from NMember order by mbno desc";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                ) {
            String fmt = "%d / %s / %s / %s\n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                String result = String.format(fmt, rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4));

                sb.append(result);
            }
            System.out.println(sb.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    } // main
} // class
