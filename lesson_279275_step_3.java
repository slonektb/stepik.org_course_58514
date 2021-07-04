/*

Тренировка

Напишите функцию value, которая принимает в качестве параметров три целых числа: a, b, c именно в таком порядке,  вычисляет значение (b+c) * a и выводит его на экран. Вызовите эту функцию в main.

Входные данные: числа в порядке a, b, c

Sample Input:

4
2
3

Sample Output:

20

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        value (a,b,c);
    }
    public static void value (int a, int b, int c) {
        int res = (b+c) * a;
        System.out.println(""+res);
    }
}























                       
                    
                       















