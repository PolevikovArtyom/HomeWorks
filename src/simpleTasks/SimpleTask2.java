package simpleTasks;

import java.util.Scanner;

public class SimpleTask2 {
    public static void main(String[] args) {

        long n;

        System.out.println("Введите целое число");

        Scanner valueUser = new Scanner(System.in);

        long num = valueUser.nextLong();

        n = num % 2;

        if (n == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
