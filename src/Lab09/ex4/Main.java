package Lab09.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> gamers = new HashMap<>();
        gamers.put(new User("Евгений"), 46);
        gamers.put(new User("Михаил"), 78);
        gamers.put(new User("Наталья"), 55);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String nameGamer = scanner.nextLine();
        findGamer(gamers, nameGamer);
    }

    static void findGamer(Map<User, Integer> gamers, String name) {
        boolean isFound = false;
        for (Map.Entry<User, Integer> item : gamers.entrySet()) {
            if (name.equalsIgnoreCase(item.getKey().getName())) {
                System.out.println("Количество очков игрока - " + item.getKey().getName() + ": " + item.getValue());
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Игрок отсутствует в списке");
        }

    }
}