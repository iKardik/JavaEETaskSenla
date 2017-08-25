package Task4;

/**
 * Created by НДС on 24.08.2017.
 */

// Наибольший общий делитель
public class GCD {
    public static long recursionGCD(long a, long b){
        if (b == 0)
            return a;
        return recursionGCD(b, a % b);
    }
}
