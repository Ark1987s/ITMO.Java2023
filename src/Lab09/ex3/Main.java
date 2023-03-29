package Lab09.ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Время заполнения и выбора объекта, с: ");
        System.out.println("ArrayList: " + Time(arrayList));
        System.out.println("LinkedList: " + Time(linkedList));
    }

    static Random random = new Random();

    static void generateNumber(List<Integer> list) {
        for (int x = 0; x < 1000000; x++) {
            list.add(random.nextInt(1000_000000));
        }
    }

    static void chooseNumber(List<Integer> list) {
        for (int y = 0; y < 100_000; y++) {
            list.get(random.nextInt(150_000));
        }
    }

    static double Time(List<Integer> list) {
        double timeStart = System.currentTimeMillis();
        generateNumber(list);
        chooseNumber(list);
        return (timeStart - System.currentTimeMillis()) / 1000;
    }
}
