/*Задание 6
Необходимо написать программу, которая удаляет из текста числа.
Текст вводится вручную во время выполнения программы.*/

import Task6.*;

import java.io.IOException;

/**
 * Created by НДС on 24.08.2017.
 */
public class Task6 {
    public static void main(String[] args) {

        String s = null;
        try {
            System.out.println("Введите текст");
            s = Routine.enterString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Результат:");
        System.out.println(DelDigit.deleteDigitsFromText(s));

    }
}
