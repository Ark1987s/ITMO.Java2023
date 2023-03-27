package Lab06.ex1;

public class Employee extends Man {
    private String bank;

    public Employee(String name, String lastname, String bank) {
        super(name, lastname);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Представитель банка %s: %s %s\n", bank, getName(), getLastname());
    }
}