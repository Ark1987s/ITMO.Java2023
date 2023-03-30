package LabThreads.ex3;

public class CountThreads extends Thread {
    Counter count;

    CountThreads(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int a = 0; a <= 999; a++) {
            count.increment();
        }
    }
}