/*


Напишите программу, которая считает число и выведет его квадрат, если он больше 100, в противном случае выведет слово "мало"

Sample Input 1:

0

Sample Output 1:

мало

Sample Input 2:

15

Sample Output 2:

225

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a*a;
        if (a > 100) {
            System.out.println(a);
        } else {
            System.out.println("мало");
        }
    }
}