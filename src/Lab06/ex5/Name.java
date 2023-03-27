package Lab06.ex5;

import java.util.Scanner;

public class Name extends Age {
    private String name;

    @Override
    public void setValue() {
        super.setValue();
        System.out.print("Введите имя: ");
        this.name = scannerAdd.nextLine();
    }

    public void display() {
        System.out.println("Ваше имя: " + name + ", Ваш возраст: " + super.getValue());
    }
}