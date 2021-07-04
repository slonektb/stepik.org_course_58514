/*

Расстояния

На одной строке вводится пара чисел - координаты точки на плоскости. Затем вводится число n. Потом идёт n строк, содержащих пары чисел - координаты других точек. Необходимо вычислить наименьшее расстояние от введённых точек до начальной.

Sample Input:

0 0
4
1 0
2 -1
0 3
4 0

Sample Output:

1.0

*/

import java.util.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int[] points_x = new int[n];
        int[] points_y = new int[n];
        double[] vectors = new double[n];
        for (int i = 0; i < n; i++) {
            points_x[i] = sc.nextInt();
            points_y[i] = sc.nextInt();
            vectors[i] = pif(a,b,points_x[i],points_y[i]);
        }
        double min = 100;
        for (int i = 0; i < n; i++) {
            if (vectors[i] < min) {
                min = vectors[i];
            }
        }
        System.out.println("" + min);
    }
    static double pif (int x1, int y1, int x2, int y2) {
        return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }
}





















                       
                    
                       















