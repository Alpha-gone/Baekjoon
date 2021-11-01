package step6;

public class Q15596 {
    public static long sum(int[] arNum){
        long sum = 0;

        for(int i =0; i < arNum.length; i++){
            sum += arNum[i];
        }
        return sum;
    }
}
