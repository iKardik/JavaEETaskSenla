import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by НДС on 24.08.2017.
 */
public class Routine {

    public static int enterIntValue() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = 0, tempValue;
        String s = "";

        try {
        s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer v = tryParseInt(s);

        if (v != null){
            tempValue = Integer.parseInt(s);
            if (tempValue > 0){
                value = tempValue;
            }
        } else{
            System.out.println("Введенные символы не являются числом или меньше 1");
            System.out.println("Перезапустите программу");
        }
        return value;

    }

    static Integer tryParseInt(String s) {
        try {
            return new Integer(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static int enterInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static long enterLong() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Long.parseLong(reader.readLine());
    }

    public static String enterString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


}
