package homeWorks;

/*
Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
Постарайтесь решить задачу наиболее оптимальным способом
 */

public class HomeWorkTask2 {
    public static void main(String[] args) {

        int[] array = {9, 10, 7, 11, 5, 6, 3, 2, 4};
        int n = 0;
        int m = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] + array[j] == 7) {
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println("Сумма чисел " + array[n] + " и " + array[m] + " равна 7.");






    }
}
