/*Задание 1
Необходимо написать программу, которая вычисляет простые числа в пределах от 1 до N.
N – вводится вручную во время выполнения программы.*/

// Решаем через решето Аткина (самый оптимальный вариант)

import java.util.BitSet;
import Task1.*;

/**
 * Created by НДС on 24.08.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите предел вычисления простых чисел:");
        int n = Routine.enterIntValue();

        // Вычисление решета Аткина
        BitSet primes = AtkinSieve.getPrimesUpTo(n);

        // Вывод результатов
        if(n != 0) {
            System.out.print("Простые числа в диапазоне от 1 до " + n + ": ");
            for (int number = 2; number <= n; ++number)
                if (primes.get(number)) {
                    System.out.format("%d", number);
                    System.out.print(" ");
                }
        }

    }
}


