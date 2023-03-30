package LabThreads.ex1;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int x = 0; x <= 100; x++) {
            System.out.printf("Thread: %s, value: %d\n", getName(), x);
        }
    }
}
