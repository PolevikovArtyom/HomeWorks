package homeWorks;
/*
Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
 */
import java.util.Arrays;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        //Создание массива с случайными числами
        int[] array = new int[10];
        final int min = 0;//Минимальный предел
        final int max = 100;//Максимальный предел

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * max);
        }
        System.out.println(Arrays.toString(array));

        //Поиск минимального, максимального и среднего значений.
        Arrays.sort(array);
        int minValue = Math.min(array[0], array[9]);
        int maxValue = Math.max(array[0], array[9]);
        int average = maxValue / array.length;
        System.out.println("Минимальное значение:" + minValue);
        System.out.println("Максимальное значение:" + maxValue);
        System.out.println("Среднее значение:" + average);

    }
}
