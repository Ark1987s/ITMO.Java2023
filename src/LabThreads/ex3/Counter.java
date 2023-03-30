package LabThreads.ex3;

public class Counter {
    int count = 0;

    synchronized public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}