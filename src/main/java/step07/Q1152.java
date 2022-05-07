package step07;

import java.io.IOException;
import java.util.StringTokenizer;
import Function.*;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        st = new StringTokenizer(IO.input(), " ");

        IO.write(Cast.ItoString(st.countTokens()));

        IO.endProg();
    }
}
