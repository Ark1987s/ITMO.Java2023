package Lab05;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(reverse("Казнить нельзя помиловать"));
    }

    public static String reverse(String text) {
        String[] strings = text.split(" ");
        String result = "";
        for (String word : strings) {
            StringBuilder stringReverse = new StringBuilder(word).reverse();
            stringReverse.append(" ");
            result += stringReverse.toString();
        }
        return result.trim();
    }
}