/*

Кондиционер

В комнате есть кондиционер, который умеет охлаждать или нагревать воздух в ней, если это необходимо. Напишите программу, которая будет эмулировать его работу, согласно дальнейшему описанию. Вводится 2 числа N - нормальная температура, которая должна быть в комнате и K - текущая температура в комнате. Если температура в комнате ниже нормы, то на дисплее должна появится фраза "ГРЕЮ на X", где X - количество градусов, на которое температура в комнате должна увеличится. Аналогично, если температура в комнате выше нормы, то должна появится фраза "ОХЛАЖДАЮ на Х". Если же в комнате нормальная температура, то кондиционер должен написать "ТЕМПЕРАТУРА В НОРМЕ".

Sample Input:

15 22

Sample Output:

ОХЛАЖДАЮ на 7

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//нормальная температура
        int K = sc.nextInt();//текущая тенмпература
        int X = N-K;
        if (X==0){
            X=0;
        }
        if (X>0) {
            X=1;
        }
        if (X<0) {
            X=2;
        }
        switch (X){
            case 0: System.out.println("ТЕМПЕРАТУРА В НОРМЕ"); break;
            case 1: System.out.println("ГРЕЮ на " + (N-K)); break;
            default: System.out.println("ОХЛАЖДАЮ на " + (K-N));  break;
        }
    }
}