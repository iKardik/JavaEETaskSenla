package Task5;

/**
 * Created by НДС on 24.08.2017.
 */
public class Palindrom {
    public static boolean isPalindrome(String s){
        String r = "";
        for (int i = s.length() - 1; i >=0; i--){
            r +=s.charAt(i);
        }

        return s.equals(r);
    }
}
