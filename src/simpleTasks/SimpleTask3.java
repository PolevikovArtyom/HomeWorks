package simpleTasks;

//Даны два целых числа n и m. Наименьшее из них сохранить в переменную res и вывести ее на экран.

import java.util.Scanner;

public class SimpleTask3 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner valueUser1 = new Scanner(System.in);
        long n = valueUser1.nextLong();

        System.out.println("Введите второе целое число");
        Scanner valueUser2 = new Scanner(System.in);
        long m = valueUser2.nextLong();

        if (n < m) {
            long res = n;
            System.out.println(res);
        } else {
            long res = m;
            System.out.println(res);
        }
    }
}
