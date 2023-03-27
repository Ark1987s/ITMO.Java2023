package Lab06.ex1;

public class Client extends Man {
    private String bank;

    public Client(String name, String lastname, String bank) {
        super(name, lastname);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Клиент банка %s: %s %s\n", bank, getName(), getLastname());
    }
}
