package Lab04.part1;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = {3,9,8,7,6,5,4,10};
        System.out.println("массив =" + Arrays.toString(array));
        if (minLengthArray(array)){
            if (threeFirstLast(array)){
                System.out.println(threeFirstLast(array));
            }}
        else {System.out.println("Длина массива должна быть не меньше двух цифр");}
    }
    public static boolean threeFirstLast (int []array)
    {
        return array[0]==3 || array[array.length-1]==3;
    }
    public static boolean minLengthArray (int[]array)
    {
        return array.length>=2;
    }
}