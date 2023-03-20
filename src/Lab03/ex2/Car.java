package Lab03.ex2;

public class Car {
    private Color color;
    private int weight;
    private String brand;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println(toString());
    }
}


class JavaProgram {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setBrand("Ford");
        car2.setBrand("Volkswagen");
        car1.setColor(Color.WHITE);
        car2.setColor(Color.BLUE);
        car1.setWeight(2256);
        car2.setWeight(1785);
        car1.display();
        car2.display();
        Car car3 = new Car(Color.GREEN);
        Car car4 = new Car(Color.YELLOW, 1432);
        car3.display();
        car4.display();
    }
}