package Lab05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        String text = "a1 b2 c3 d4 a1";
        String fragment = "a1";
        System.out.printf("Количество вхождений подстроки '%s' в строку '%s' составляет: %s", fragment, text, quantity(text, fragment));
    }

    public static int quantity(String text, String fragment) {
        Pattern pattern = Pattern.compile(fragment);
        Matcher matcher = pattern.matcher(text);
        int a = 0;
        while (matcher.find()) {
            a++;
        }
        return a;
    }
}
