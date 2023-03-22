package Lab04.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int length = scanner.nextInt();
        System.out.print("Input numbers of array: \n");
        inputArray(length);
        System.out.println("Result: ): " + Arrays.toString(array));
    }

    public static void inputArray(int length) {
        array = new int[length];
        for (int x = 0; x < array.length; x++) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            array[x] = num;
        }
    }
}
