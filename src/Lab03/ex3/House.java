package Lab03.ex3;

import java.util.Scanner;

public class House {
    private int floor;
    private int year;
    private String name;
    private int actualYear;


    public void setHouse(int floor, String name, int year) {
        this.year = year;
        this.name = name;
        this.floor = floor;
    }

    public void display(int actualYear) {
        System.out.println("Дом: " + floor + "-этажный, " + name + ", " + year + " год, возраст здания - " + getDate(actualYear));

    }

    public int getDate(int actualYear) {
        return actualYear - year;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(2, "детский сад", 1977);
        house2.setHouse(30, "бизнес центр", 2018);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int i = scanner.nextInt();
        house1.display(i);
        house2.display(i);
    }
}