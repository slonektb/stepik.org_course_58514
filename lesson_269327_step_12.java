/*

Найдите Легасофт 2.0

Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом". Слова - паразиты не считаются нормальными словами.

Необходимо выяснить, было ли среди введённых слов слово "Легасофт". Если да, то выведите, каким по счёту нормальным словом оно было введено.

Sample Input 1:

Привет
Я
учусь
в
компании
Легасофт
Это
Прикольно)
СТОП

Sample Output 1:

6

Sample Input 2:

Привет
Я
учусь
ээээ
в
компании
ээээ
Легасофт
Это
Прикольно)
СТОП

Sample Output 2:

6

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int i = 0;
        int j = 0;
        while (true) {
            a = sc.nextLine();
            if (a.equals("СТОП")) {
                break;
            } else if (a.equals("Легасофт")) {
                i = j+1;
            } else if (!a.equals("ээээ") && !a.equals("потом")) {
                j++;
            }

        }

        if (i == 0) {
            System.out.println("NO");
        } else {
            System.out.println(i);
        }
    }
}





                       
                    
                       















