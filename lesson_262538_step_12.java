/*


Вводится 3 целых числа, выведите большее из них

Sample Input:

1 2 3

Sample Output:

3

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b){
            if (a>=c){
                System.out.print(a);
            }else{
                System.out.print(c);
            }
        }if (a<b){
            if (b>c){
                System.out.print(b);
            }else{
                System.out.print(c);
            }
        }
    }
}