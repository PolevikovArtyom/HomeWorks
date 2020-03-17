package homeWorks;
//    Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
public class StringTask2 {
    public static void main(String[] args) {
        String string = "Когда рак на горе свистнет";
        String[] arrString = string.split("\\s");

        int maxLenght = 0;
        String longestWord = "new";

        for (String word: arrString) {
            int i = word.length();
            if (i > maxLenght) {
                maxLenght = i;
                longestWord = word;
            }

        }
        System.out.println(longestWord);
    }
}
