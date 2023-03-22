package Lab04.part2;

import java.util.Arrays;

public class Ex1 {
    static private boolean isTrue;

    public static void main(String[] args) {
        int[] array = {1, 7, 10, 56, 57, 89};
        System.out.println("array =" + Arrays.toString(array));
        if (isSort(array)) {
            System.out.println("Ok");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static boolean isSort(int[] array) {
        for (int x = 1; x < array.length; x++) {
            if (array[x] > array[x - 1]) {
                isTrue = true;
            } else {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
