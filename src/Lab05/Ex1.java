package Lab05;

public class Ex1 {
    public static void main(String[] args) {
        String text = "На дощатой террасе близ конопляника под звуки виолончели ...";
        System.out.println(longWord(text));
    }

    public static String longWord(String string) {
        String[] words = string.split(" ");
        int maxLength = 0;
        String maxWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
            }
        }
        return maxWord;
    }
}