package Task6;

/**
 * Created by НДС on 24.08.2017.
 */
public class DelDigit {
    public static String deleteDigitsFromText(String s){

       String res ="";

        for (int i = 0; i <= s.length() - 1; i++){

            if (!((s.charAt(i) >= 48) && (s.charAt(i) <= 57))) {
                res += s.charAt(i);
            }
        }

        return res;

    }


}
