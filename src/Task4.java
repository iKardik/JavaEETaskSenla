/*Задание 4
Необходимо написать рекурсивный алгоритм для нахождения НОД и НОК двух чисел.
Два числа вводятся вручную во время выполнения программы.*/

import Task4.*;

import java.io.IOException;

/**
 * Created by НДС on 24.08.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        long a = 0;
        long b = 0;

        try {
            System.out.println("Введите число а");
            a = Routine.enterLong();
            System.out.println("Введите число b");
            b = Routine.enterLong();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("НОД чисел " + a + " и " + b + " равен ");
        System.out.println(GCD.recursionGCD(a, b));

        System.out.print("НОК чисел " + a + " и " + b + " равен ");

        System.out.println(LCM.lcm(a, b));

    }
}
