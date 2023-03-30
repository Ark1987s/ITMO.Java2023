package LabThreads.ex2;

public class VisionThread extends Thread {

    @Override
    public void run() {
        System.out.println("The thread in progress: " + getState());
    }
}