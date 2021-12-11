package jaemuk.basic.lab;

public class EmployeeVO {
    // 멤버변수 선언
    protected String empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String mgrid;
    protected String deptid;
    protected String regdate;

    // 생성자

    public EmployeeVO() {
    }

    public EmployeeVO(String empno, String fname, String lname, String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public EmployeeVO(String empno, String fname, String lname, String email,
                      String phone, String hdate, String jobid, int sal, double comm,
                      String mgrid, String deptid, String regdate) {
        this(empno, fname, lname, email, phone, hdate);
        // 이미 정의한 생성자를 호출해서 값들을 초기화함

        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
        this.regdate = regdate;
    }

    // setter
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    // getter
    public String getEmpno() {
        return empno;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHdate() {
        return hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public int getSal() {
        return sal;
    }

    public double getComm() {
        return comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public String getRegdate() {
        return regdate;
    }

    @Override
    public String toString() {
        String fmt = "emp{사번 : %s, 이름 : %s, 성 : %s, 이메일 : %s, 전화번호 : %s, 입사일 : %s \n" +
                "직책 : %s, 급여 : %d, 수당 : %.1f, 상사번호 : %s, 부서번호 : %s} \n";
        String result = String.format(fmt, empno, fname, lname, email, phone, hdate,
                jobid, sal, comm, mgrid, deptid);

        return result;
    }
}
