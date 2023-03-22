package Lab04.part2;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 3, 2, 3};
        System.out.println("Array: " + Arrays.toString(array));
        uniqueNum(array);
    }

    public static void uniqueNum(int[] array) {

        for (int x = 0; x < array.length; x++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[x] == array[j] && x != j) {
                    ++count;
                }
            }
            if (count == 0) {
                System.out.println("The first unique number: " + array[x]);
                break;
            }
        }
    }
}