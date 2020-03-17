package homeWorks;
/*
Даны 2 слова, состоящие из четного числа букв.
Получить слово состоящее из первой половины первого слова и второй половины второго слова.
 */
public class StringTask1 {
    public static void main(String[] args) {
        String word1 = "home";
        String word2 = "building";

        String halfWord1 = word1.substring(0, word1.length() / 2);
        String halfWord2 = word2.substring(word2.length() / 2, word2.length());
        System.out.println(halfWord1 + halfWord2);

    }
}
