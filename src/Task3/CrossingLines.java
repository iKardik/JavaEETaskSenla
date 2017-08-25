package Task3;

/**
 * Created by НДС on 24.08.2017.
 */
public class CrossingLines {

    public static boolean isCross(Line a, Line b){              // возвращает true если пересикаются
                                                                // возвращает false если пересекаются в концах или вовсе не пересекаются
        boolean intersection = false;

        int ax1 = a.getX1();
        int ax2 = a.getX2();
        int ay1 = a.getY1();
        int ay2 = a.getY2();

        int bx1 = b.getX1();
        int bx2 = b.getX2();
        int by1 = b.getY1();
        int by2 = b.getY2();

        int v1 = (bx2-bx1)*(ay1-by1) - (by2-by1)*(ax1-bx1);
        int v2 = (bx2-bx1)*(ay2-by1) - (by2-by1)*(ax2-bx1);
        int v3 = (ax2-ax1)*(by1-ay1) - (ay2-ay1)*(bx1-ax1);
        int v4 = (ax2-ax1)*(by2-ay1) - (ay2-ay1)*(bx2-ax1);

        if (v1 * v2 < 0 && v3 * v4 < 0){
            intersection = true;
        }

        return intersection;
    }
}
