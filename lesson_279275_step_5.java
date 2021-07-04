/*

Простая сумма

Напишите программу, которая считает сумму двух целых чисел. Используйте для этого функцию

sum (int a, int b), которая должна возвращать значение их суммы

Sample Input:

8 11

Sample Output:

19

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("" + sum(a,b));
    }
    static int sum (int a, int b) {
       return a+b;   
    }
}



















                       
                    
                       















