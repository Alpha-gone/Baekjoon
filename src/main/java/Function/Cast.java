package Function;

public class Cast{
    public static String ItoString(int nNum){
        return Integer.toString(nNum);
    }

    public static int StoInt(String sStr){
        return Integer.parseInt(sStr);
    }

    public static int CtoInt(Character cChar){
        return Character.getNumericValue(cChar);
    }
    public static String CtoString(Character cChar){
        return Character.toString(cChar);
    }

    public static String DtoString(double dNum){
        return Double.toString(dNum);
    }

    public static double StoDouble(String sStr){
        return Double.parseDouble(sStr);
    }
        
}