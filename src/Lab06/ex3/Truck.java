package Lab06.ex3;

public class Truck extends Car {
    private int wheelsQuantity;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wq, int mw) {
        super(w, m, c, s);
        wheelsQuantity = wq;
        maxWeight = mw;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + wheelsQuantity + ", максимальный вес - " + maxWeight);
    }

    public void newWheels(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
        System.out.println("Количество колес - " + wheelsQuantity);
    }
}
