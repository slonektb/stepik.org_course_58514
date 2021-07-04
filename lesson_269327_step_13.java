/*

Второй максимум

Пользователь вводит натуральное число n, затем n целых чисел. Необходимо определить и вывести на экран второе максимальное значение из них. Гарантируется, что будет введено хотя бы 2 числа.

Sample Input:

5
1
2
3
4
5

Sample Output:

4

*/


import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int[] numbers = new int[numCount];

        for (int i = 0; i < numbers.length; i++) {
            int nxt = sc.nextInt();
            numbers[i] = nxt;
        }

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);        
    }
}





                       
                    
                       















