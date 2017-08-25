package Task4;

/**
 * Created by НДС on 24.08.2017.
 */

//Наименьшее общее кратное
public class LCM {
    public static long lcm(long a, long b){

        return a*b/GCD.recursionGCD(a, b);
    }
}
