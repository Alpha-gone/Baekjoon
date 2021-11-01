package step9;

import java.io.IOException;
import java.text.DecimalFormat;
import Function.*;

public class Q3053 {
    public static void main(String[] args) throws IOException {
        DecimalFormat form = new DecimalFormat("#.000000");
        double dInput;
        
        dInput = Cast.StoDouble(IO.bInput());

        IO.bWrite(form.format(Math.PI * dInput * dInput) + "\n");
        IO.bWrite(form.format(2 * dInput * dInput) + "\n");
       
        IO.EndProg();
    }
}

