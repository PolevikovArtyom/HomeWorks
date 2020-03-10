package homeWorks;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        //Применяется алгоритм Евклида

        System.out.println("Введите первое число");
        Scanner valueUser1 = new Scanner(System.in);
        long a = valueUser1.nextLong();

        System.out.println("Введите второе число");
        Scanner valueUser2 = new Scanner(System.in);
        long b = valueUser2.nextLong();

        while ( a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        System.out.println(a + b);



    }





}
