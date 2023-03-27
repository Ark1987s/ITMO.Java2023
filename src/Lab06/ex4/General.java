package Lab06.ex4;

import java.util.Scanner;

public class General {
    private int number;
    Scanner scanner = new Scanner(System.in);

    public void setNumber() {
        System.out.print("Введите целое число: ");
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public General() {
    }
}