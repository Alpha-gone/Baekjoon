package step06;

import java.io.*;
import Function.*;

public class Q1065 {
    public static int hanNum(int nNum) {
        int nCount;
        int nOne, nTen, nHun;

        if (nNum < 100) {
            nCount = nNum;
        } else {
            nCount = 99;
            if (nNum == 1000) {
                nNum = 999;
            }

            for (int i = 100; i <= nNum; i++) {
                nHun = i / 100;
                nTen = i / 10 % 10;
                nOne = i % 10;

                if ((nTen - nOne) == (nHun - nTen)) {
                    nCount++;
                }
            }
        }

        return nCount;
    }

    public static void main(String[] args) throws IOException {

        IO.write(Cast.ItoString(hanNum(Cast.StoInt(IO.input()))));

        IO.endProg();
    }
}
