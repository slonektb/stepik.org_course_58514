/*

Простая обработка массива

Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

Sample Input:

4
1
2
3
5
2

Sample Output:

2
4
6
10

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt(); 
        }
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]*b);
        }  
    }
}










                       
                    
                       















