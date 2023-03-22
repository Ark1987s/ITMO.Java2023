package Lab04.part1;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = {10, 8, 6, 7, 5, 3, 15, 6};
        System.out.println("массив =" + Arrays.toString(array));
        System.out.println(oneThreeOf(array));
    }


    public static boolean oneThreeOf(int[] array) {
        boolean isContains = false;
        for (int j : array) {
            if (j == 1 || j == 3) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }
}