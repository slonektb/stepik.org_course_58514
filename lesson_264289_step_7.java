/*

Калькулятор

Пользователь вводит с клавиатуры действительное число, операцию (одну из +, -, *, /) и снова действительное число. Ваша задача - вычислить значение и вывести его на экран. Если пользователь ввёл неизвестную операцию, или пытается совершить невозможное (с точки зрения математики) действие, то ваша программа должна вывести слово "ОШИБКА".

Sample Input 1:

2
+
3

Sample Output 1:

5.0

Sample Input 2:

5
&
4

Sample Output 2:

ОШИБКА

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        String s = scan.next();
        double b = scan.nextDouble();

            switch (s) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "/":
                   if (b == 0){
                       System.out.println("ОШИБКА");
                   } else{
                       System.out.println(a / b);
                   }
                   break;
                case "*":
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println("ОШИБКА");
                    break;
        }
    }
}