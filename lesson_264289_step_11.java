/*

Сдача

Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?
Входные данные

Вводятся 4 числа: a, b, c и d.   0 <= b, d < 100, 0 <a, c
Выходные данные

Необходимо вывести 2 числа: e и f, число рублей и копеек, соответственно. Если за товар заплатили меньше, чем он стоит, то выведите "мало"

Sample Input 1:

5 50 6 40

Sample Output 1:

0 90

Sample Input 2:

6 82 3 41

Sample Output 2:

мало

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//
        int b = sc.nextInt();//
        int c = sc.nextInt();//
        int d = sc.nextInt();//
        int ef = (c * 100 + d) - (a * 100 + b);
        if (ef < 0) {
            System.out.println("мало");
        } /* else if (ef == 0) {
            System.out.print("0 00");
        }*/ else {
            int e = ef / 100;
            int f = ef % 100;
           /* if (f < 10) {
                System.out.print(e + " 0" + f);
            } else {*/
                System.out.print(e + " " + f);
            //}

        }
    }
}