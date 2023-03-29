package Lab09.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("third");
        list.add("second");
        list.add("first");
        list.add("third");
        System.out.println("Исходные данные:\n" + list);
        Set<String> listNoDuplicate = noDuplicate(list);
        System.out.println("Данные без дубликатов:\n" + listNoDuplicate);
    }

    static Set<String> noDuplicate(List<String> l) {
        return new HashSet<>(l);
    }
}
