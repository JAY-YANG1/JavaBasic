package jaemuk.basic.day19;

import jaemuk.basic.lab.EmployeeVO;

import java.util.List;

public interface EmployeeDAOV2 {
    int insertEmployee(EmployeeVO empvo);
    List<EmployeeVO> selectEmployee();
    EmployeeVO selectOneEmployee(int empno);
    int updateEmployee(EmployeeVO empvo);
    int deleteEmployee(int empno);
}
