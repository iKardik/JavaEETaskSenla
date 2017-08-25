/*Задание 2
Необходимо написать программу, которая вычисляет числа Фибоначчи в пределах от 1 до N.
N – вводится вручную во время выполнения программы.*/

// Решаем возведением в степень матрицы
import Task2.*;
/**
 * Created by НДС on 24.08.2017.
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите предел вычисления чисел Фибоначи:");
        int n = Routine.enterIntValue();

        if (n !=0) {
            System.out.println("Числа фибоначи при N = " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(Fibo.fiboN(i));
                System.out.print(" ");
            }
        }
    }
}
