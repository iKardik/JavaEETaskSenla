/*Задание 5
Необходимо написать программу, которая проверяет слово на "палиндромность".
Слово для проверки вводится вручную во время выполнения программы.*/
import Task5.*;

import java.io.IOException;

/**
 * Created by НДС on 24.08.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println("Введите слово проверяемое на палиндромность");
            s = Routine.enterString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Palindrom.isPalindrome(s)){
            System.out.println("Слово " + s + " является палиндромом");
        } else {
            System.out.println("Слово " + s + " не является палиндромом");
        }

    }
}
