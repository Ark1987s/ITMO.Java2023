package Lab04.part1;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Делится на 3: ");
        divideByThreeFive(3);
        System.out.print("\nДелится на 5: ");
        divideByThreeFive(5);
        System.out.print("\nДелится на 3 и на 5: ");
        divideByThreeAndFive(3, 5);
    }

    public static void divideByThreeFive(int num) {
        for (int x = 1; x <= 100; x++) {
            if (x % num == 0) {
                System.out.print(x + " ");
            }
        }
    }

    public static void divideByThreeAndFive(int three, int five) {
        for (int x = 1; x <= 100; x++) {
            if (x % three == 0 && x % five == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
