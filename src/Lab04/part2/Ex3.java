package Lab04.part2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println("Array1: " + Arrays.toString(array));
        changeNum(array);
        System.out.println("Array2: " + Arrays.toString(array));
    }

    public static void changeNum(int[] array) {
        int a = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = a;
    }
}