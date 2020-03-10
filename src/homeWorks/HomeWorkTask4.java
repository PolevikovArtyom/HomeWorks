package homeWorks;

import java.util.Scanner;

public class HomeWorkTask4 {
    public static void main(String[] args) {
        /*
        Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
         */

        while (true) {
            System.out.println("Введите натуральное число больше 3:");
            Scanner valueUser = new Scanner(System.in);
            int n = valueUser.nextInt();

            if (n > 3) {
                break;
            } else
                System.out.println("Попробуйте ввести другое число");
        }

        int[] array;
        //array = new int[];
        //Как вывести значение сканера из цикла, так и не понял.




    }
}
