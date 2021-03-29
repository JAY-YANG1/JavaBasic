package jaemuk.basic.day10;

import jaemuk.basic.sungjuk.SungJukService;
import jaemuk.basic.sungjuk.SungJukServiceImpl;
import jaemuk.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        // SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();

        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);


    }
}
