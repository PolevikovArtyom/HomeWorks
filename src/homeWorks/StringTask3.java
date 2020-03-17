package homeWorks;

import java.util.Arrays;

// Имеются две строки. Найти количество вхождений одной строки в другую.
public class StringTask3 {
    public static void main(String[] args) {
        String string1 = "A well a bird bird bird the bird is the word";
        String string2 = "bird";

        String[] arrString1 = string1.split("\\s");
        System.out.println(Arrays.toString(arrString1));

        int var = 0;

        for (String word : arrString1) {
            if (word.contains(string2)) {
                var++;
            }
        }
        System.out.println(var);

    }
}
