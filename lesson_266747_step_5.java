/*

Квадраты

Пользователь вводит натуральное число необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.

Sample Input:

17

Sample Output:

1
4
9
16

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//
        int i = 1;
        while (i*i <= a ) {
            System.out.println(i*i);
            i++;
        }
    }
}




