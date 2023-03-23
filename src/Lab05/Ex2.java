package Lab05;

public class Ex2 {
    public static void main(String[] args) {
        String word = "ротор";
        if (palindromeWord(word)) {
            System.out.println("Слово: " + word + " - это палиндром");
        } else {
            System.out.println("Слово: " + word + " не является палиндромом");
        }
    }

    public static boolean palindromeWord(String word) {
        String stringRev = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(stringRev);
    }
}