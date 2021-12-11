package jaemuk.basic.lab;

import jaemuk.basic.day19.EmployeeDAOV2;

public class EmployeeServiceV2Impl implements EmployeeService {

    private static EmployeeService empsrv = null;
    private static EmployeeDAOV2 empdao;

    public EmployeeServiceV2Impl() {
        empdao = EmployeeDAOV2Impl.getInstance();
    }

    public static EmployeeService getInstance() {
        if (empsrv == null) {
            empsrv = new EmployeeServiceV2Impl();
        } return empsrv;
    }

    @Override
    public void displayMenu() {
        String displayMenu =
                "======================\n" +
                        "   사원관리 프로그램 v1    \n" +
                        "======================\n" +
                        "   1. 사원정보 입력    \n" +
                        "   2. 사원정보 조회    \n" +
                        "   3. 사원정보 상세조회\n" +
                        "   4. 사원정보 수정    \n" +
                        "   5. 사원정보 삭제    \n" +
                        "   0. 프로그램 종료      \n" +
                        "----------------------\n" +
                        "   작업을 선택하세요 : ";

        System.out.print(displayMenu);
    }

    @Override
    public void newEmployee() {

    }

    @Override
    public void showEmployee() {

    }

    @Override
    public void showOneEmployee() {

    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void makeExtInfo(EmployeeVO emp) {

    }
}
