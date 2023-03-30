package LabThreads.ex4;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        new NameThread(object).start();
        new NameThread(object).start();
    }
}
