package Lab03.ex4;

public class Tree {
    public int age;
    public boolean live;
    public String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean live, String name) {
        this.age = age;
        this.live = live;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(25, "Тополь");
        Tree tree3 = new Tree(100, true, "Секвойя");
        System.out.println("Дерево: " + tree2.name + ", " + tree2.age + "лет");
        System.out.println("Дерево: " + tree3.name + ", " + tree3.age + "лет, живое - " + tree3.live);
    }
}