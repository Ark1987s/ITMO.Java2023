package LabThreads.ex4;

public class NameThread extends Thread {
    private Object object;

    NameThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                try {
                    System.out.println("Name of thread:" + getName());
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}