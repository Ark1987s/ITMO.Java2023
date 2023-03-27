package Lab06.ex3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(8000, "Scania", 's', 140, 10, 50);
        truck.outPut();
        System.out.println("");
        truck.newWheels(6);
        System.out.println("");
        truck.outPut();
    }
}