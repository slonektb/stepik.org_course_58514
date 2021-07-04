/*

Сумма

Пользователь вводит целые числа до тех пор, пока не введёт 0. Найдите сумму положительных чисел. Если же такую сумму найти не удалось, то выведите на экран "Не найдено".

Sample Input:

3
1
2
-4
0

Sample Output:

6

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        int sum = 0;
        while (a != 0) {
            a = sc.nextInt();
            if (a > 0) {
                sum = sum + a;
            }
        }

        if (sum == 0) {
            System.out.println("Не найдено");
        } else {
            System.out.println(sum);
        }
    }
}




