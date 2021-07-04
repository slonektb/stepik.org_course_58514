/*

Повторение 1

Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.

Sample Input:

3
7
2
9

Sample Output:

18

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            sum = sum + b;
        }
        System.out.println(sum);
    }
}

















