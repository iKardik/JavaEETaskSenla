package Task2;

/**
 * Created by НДС on 24.08.2017.
 */
// Значение числа фибоначи расчитывается возведением матрицы в степень
public class Fibo {
    public static int fiboN(int n){

        int a = 1, b = 1, c = 1;                                        // матрица возводимая в степень
        int ta, tb, tc, td;                                             // временная матрица
        int ra = 1, rb = 1, rc = 1, rd = 0;                             // результирующая матрица

        // при N = 1 или 2 все просто
        if (n == 2 || n == 1){
            rc = c*a;
        }
        else{                   // при N > 2 возводим матрицу в степень N
           while (n > 1){
            ta = ra*a + b*rc;
            tb = rb*a + c*rd;
            tc = ra*c;
            td = c*rb;

            ra = ta;
            rb = tb;
            rc = tc;
            rd = td;

            n--;
            }
        }
        return rc;
    }
}
