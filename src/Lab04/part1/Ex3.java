package Lab04.part1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numA = scanner.nextInt();
        System.out.print("\nВведите второе число: ");
        int numB = scanner.nextInt();
        System.out.print("\nВведите третье число: ");
        int numC = scanner.nextInt();

        if (sum(numA, numB, numC)) {
            System.out.print("\nСумма двух чисел равна третьему числу: " + (sum(numA, numB, numC)));
        } else {
            System.out.print("\nСумма двух чисел равна третьему числу: " + (sum(numA, numB, numC)));
        }
    }

    public static boolean sum(int numA, int numB, int numC) {
        return numA + numB == numC;
    }
}
