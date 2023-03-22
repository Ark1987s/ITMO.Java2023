package Lab04.part2;

import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int x = 0; x < array.length; x++) {
            array[x] = random.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] result = arraySort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(result));
    }

    public static int[] arraySort(int[] source) {
        System.out.println(Arrays.toString(source));
        if (source.length < 2) {
            return source;
        }

        int middle = source.length / 2;
        int[] left = new int[middle];
        int[] right;

        if (source.length % 2 == 0) {
            right = new int[middle];
        } else {
            right = new int[middle + 1];
        }

        for (int x = 0; x < left.length; x++) {
            left[x] = source[x];
        }

        for (int y = 0; y < right.length; y++) {
            right[y] = source[middle + y];
        }

        left = arraySort(left);
        right = arraySort(right);

        return parts(left, right);
    }

    private static int[] parts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPart = 0;
        int rightPart = 0;
        int finalResult = 0;

        while (leftPart < left.length || rightPart < right.length) {
            if (leftPart < left.length && rightPart < right.length) {
                if (left[leftPart] < right[rightPart]) {
                    result[finalResult++] = left[leftPart++];
                } else {
                    result[finalResult++] = right[rightPart++];
                }
            } else if (leftPart < left.length) {
                result[finalResult++] = left[leftPart++];

            } else if (rightPart < right.length) {
                result[finalResult++] = right[rightPart++];
            }
        }
        return result;
    }
}
