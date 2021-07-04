/*


Исправьте программу, со слайда 6.

Вам вводится целое число, вы должны вывести, каким оно является.

Sample Input:

8

Sample Output:

Ваше число положительное


*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean a_is_pozitive = a > 0;
        if (a_is_pozitive) {
            System.out.println("Ваше число положительное");
        }else if (a < 0){
            System.out.println("Ваше число отрицательное");
        } else {
            System.out.println("0");
        }
    }
}