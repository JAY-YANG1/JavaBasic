package jaemuk.basic.lab;

import jaemuk.basic.day19.EmployeeDAOV2;
import jaemuk.basic.jdbc.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeDAOV2Impl implements EmployeeDAOV2 {

    // 싱글톤 시작
    private static EmployeeDAOV2 empdao = null;
    private JDBCUtil jdbc;

    public EmployeeDAOV2Impl() {
        jdbc = new JDBCUtil();
    }

    public static EmployeeDAOV2 getInstance() {
        if (empdao == null) {
            empdao = new EmployeeDAOV2Impl();
        } return empdao;
    }
    // 싱글톤 끝

    String insertSQL = "insert emp(fname, lname, email, phone) " +
                        "values(?,?,?,?)";
    String selectSQL = "select empno, fname, lname, email, phone from emp";
    String selectOneSQL = "select * from emp where empno = ?";
    String updateSQL = " update emp set fname = ?, lname = ?, email = ? " +
            " phone = ?, jobid = ?, sal = ?, comm = ?, mgrid = ?, deptid = ?, " +
            " regdate = current_timestamp " +
            " where empno = ?";
    String deleteSQL = "delete from emp where empno = ?";



    @Override
    public int insertEmployee(EmployeeVO empvo) {
        int cnt = 0;

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(insertSQL)
                ) {
            pstmt.setString(1, empvo.getFname());
            pstmt.setString(2, empvo.getLname());
            pstmt.setString(3, empvo.getEmail());
            pstmt.setString(4, empvo.getPhone());

            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cnt;
    }

    @Override
    public List<EmployeeVO> selectEmployee() {
        return null;
    }

    @Override
    public EmployeeVO selectOneEmployee(int empno) {
        return null;
    }

    @Override
    public int updateEmployee(EmployeeVO empvo) {
        return 0;
    }

    @Override
    public int deleteEmployee(int empno) {
        return 0;
    }
}
