/*

Найдите Легасофт

Пользователь вводит слова до тех пор, пока не введёт "СТОП". Необходимо выяснить, было ли среди введённых слов слово "Легасофт". Если да, то выведите "YES", если нет, то  "NO".

Sample Input:

Привет
Я
учусь
в
компании
Легасофт
Это
Прикольно)
СТОП

Sample Output:

YES

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int i = 0;
        while (true) {
            a = sc.nextLine();
            if (a.equals("СТОП")) {
                break;
            } else if (a.equals("Легасофт")) {
                i = 1;
            }

        }

        if (i == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
                       
                    
                       















