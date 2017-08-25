/*Задание 3
Необходимо написать программу, которая определеет пересекаются ли два отрезка.
Координаты отрезков вводятся вручную во время выполнения программы.*/

import Task3.*;

import java.io.IOException;

/**
 * Created by НДС on 24.08.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int ax1 = 0, ax2 = 0, bx1 = 0, bx2 = 0, ay1 = 0, ay2 = 0, by1 = 0, by2 = 0;
        try {
            System.out.println("Введите координаты x1 и у1 отрезка А");
            ax1 = Routine.enterInt();
            ay1 = Routine.enterInt();

            System.out.println("Введите координаты x2 и у2 отрезка А");
            ax2 = Routine.enterInt();
            ay2 = Routine.enterInt();

            System.out.println("Введите координаты x1 и у1 отрезка В");
            bx1 = Routine.enterInt();
            by1 = Routine.enterInt();

            System.out.println("Введите координаты x2 и у2 отрезка В");
            bx2 = Routine.enterInt();
            by2 = Routine.enterInt();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Line a = new Line(ax1, ay1, ax2, ay2);
        Line b = new Line(bx1, by1, bx2, by2);

        if (CrossingLines.isCross(a, b)){
            System.out.println("Отрезки А и В пересекаются.");
        } else{
            System.out.println("Отрезки А и В не пересекаются");
        }


    }
}
