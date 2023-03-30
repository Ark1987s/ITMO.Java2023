package LabThreads.ex3;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        for (int i = 0; i <= 99; i++) {
            CountThreads countThread = new CountThreads(count);
            countThread.start();
            try {
                countThread.join();
                System.out.println("Counter №" + i + " = " + +count.getCount());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}