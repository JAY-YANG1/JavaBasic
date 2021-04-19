package jaemuk.basic.library;

public class LibraryVO {

    // 멤버 변수 선언
    protected String lbname;     // 도서관명
    protected String sido;     // 시도명
    protected String gugun;    // 시군구명
    protected String lbtype;     // 도서관유형
    protected String clsday;   // 휴관일
    protected String addr;   // 소재지도로명주소
    protected String phone;     // 도서관전화번호
    protected String homepage;  // 홈페이지주소
    protected double lat;      // 위도
    protected double lon;       // 경도


    // 생성자
    public LibraryVO() {
    }

    public LibraryVO(String lbname, String sido, String gugun,
                     String lbtype, String clsday, String addr,
                     String phone, String homepage, double lat, double lon) {
        this.lbname = lbname;
        this.sido = sido;
        this.gugun = gugun;
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }


    // setter
    public void setLbname(String lbname) {
        this.lbname = lbname;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public void setGugun(String gugun) {
        this.gugun = gugun;
    }

    public void setLbtype(String lbtype) {
        this.lbtype = lbtype;
    }

    public void setClsday(String clsday) {
        this.clsday = clsday;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }


    // getter
    public String getLbname() {
        return lbname;
    }

    public String getSido() {
        return sido;
    }

    public String getGugun() {
        return gugun;
    }

    public String getLbtype() {
        return lbtype;
    }

    public String getClsday() {
        return clsday;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    @Override
    public String toString() {
        String fmt = "library{ 도서관명 : %s, 시도명 : %s, 시군구명 : %s, 도서관유형 : %s,\n" +
                "휴관일 : %s, 도로명주소 : %s, 전화번호 : %s, 홈페이지주소 : %s, \n" +
                "위도 : %f, 경도 : %f }\n";
        String result = String.format(fmt, lbname, sido, gugun, lbtype, clsday,
                addr, phone, homepage, lat, lon);
        return result;
    }
}
