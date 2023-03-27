package Lab06.ex5;

import java.util.Scanner;

public class Age {
    private int value;
    Scanner scanner = new Scanner(System.in);
    Scanner scannerAdd= new Scanner(System.in);

    public void setValue() {
        System.out.print("Введите возраст: ");
        this.value = scanner.nextInt();
    }


    public int getValue() {
        return value;
    }

    public Age() {
    }
}