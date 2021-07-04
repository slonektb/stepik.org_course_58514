/*


У N друзей было лукошко, в котором было К яблок. Они решили поделить их поровну, а оставшиеся отдать Бабушке Клаве. Узнайте, сколько яблок получил, каждый из друзей.

Сначала вводится число друзей N, а потом число яблок K.

На первой строчке выведите, сколько яблок получил каждый из друзей, а на второй - сколько яблок получила Бабушка Клава.

Sample Input 1:

3 17

Sample Output 1:

5
2

Sample Input 2:

5 40

Sample Output 2:

8
0

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k/n);
        System.out.println(k%n);
    }
}