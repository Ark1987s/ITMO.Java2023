package Lab06.ex1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Григорий", "Сидоров", "Уралсиб");
        Employee employee = new Employee("Ярослав", "Иванов", "Сбербанк");
        client.display();
        employee.display();
    }
}