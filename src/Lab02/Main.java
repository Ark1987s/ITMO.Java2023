package Lab02;

public class Main {
    public static void main(String[] args) {


        // Task 1

        Calculator calculator = new Calculator();

        System.out.println("Results (addition, subtraction, multiplication, division):");


        System.out.println(calculator.AddCalc(5, 88));
        System.out.println(calculator.AddCalc(10000000L, 4000000L));
        System.out.println(calculator.AddCalc(6.3, 5.0));
        System.out.println('\n');

        System.out.println(calculator.SubCalc(4, 7));
        System.out.println(calculator.SubCalc(800L, 20L));
        System.out.println(calculator.SubCalc(13.3, 7.4));
        System.out.println('\n');

        System.out.println(calculator.MultiCalc(2, 46));
        System.out.println(calculator.MultiCalc(6L, 11L));
        System.out.println(calculator.MultiCalc(5.1, 3.2));
        System.out.println('\n');

        System.out.println(calculator.DivCalc(6, 4));
        System.out.println(calculator.DivCalc(128L, 48L));
        System.out.println(calculator.DivCalc(10.0, 8.0));
        System.out.println('\n');


        // Task 2

        Sportsman sportsman = new Sportsman();
        System.out.println(sportsman);
        System.out.println(sportsman.getName() + '\n');

        Sportsman runner = new Sportsman("running", "Usain St. Leo Bolt", 36, 195, 94, "World champion", "Jamaica");
        System.out.println(runner.getType());
        System.out.println(runner.getName());
        System.out.println(runner.getAge());
        System.out.println(runner.getHeight());
        System.out.println(runner.getWeight());
        System.out.println(runner.getAward());
        System.out.println(runner.getCountry());

    }
}
