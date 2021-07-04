/*


Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это невозможно, то выводит слово "Error"

Sample Input:

10 2

Sample Output:

5.0


*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b !=0) {
          System.out.println(a/b);
        } else {
            System.out.println("Error");
        }
    }
}