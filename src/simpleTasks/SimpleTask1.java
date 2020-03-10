package simpleTasks;

//В переменной n хранится натуральное трёхзначное число. Вывсети в консоль сумму цифр числа n.

import java.util.Scanner;

public class SimpleTask1 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное трёхзначное число");
        Scanner valueUser = new Scanner(System.in);
        int n = valueUser.nextInt();

        int x = n / 100;
        int z = n % 10;
        int yX = n / 10;//Промежуточное значение, для вычисления второй цифры
        int y = yX % 10;
        System.out.println(x + y + z);
    }
}