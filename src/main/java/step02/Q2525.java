package step02;

import Function.Cast;
import Function.IO;

import java.io.*;
import java.util.StringTokenizer;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int hour, minute, coockingTime;

        stringTokenizer = new StringTokenizer(IO.input(), " ");
        hour = Cast.StoInt(stringTokenizer.nextToken());
        minute = Cast.StoInt(stringTokenizer.nextToken());

        coockingTime = Cast.StoInt(IO.input().trim());

        minute +=  (coockingTime % 60);

        hour += (coockingTime / 60) + (minute / 60);


        IO.write(Cast.ItoString(hour % 24) + " " + Cast.ItoString(minute % 60));

        IO.endProg();
    }
}
