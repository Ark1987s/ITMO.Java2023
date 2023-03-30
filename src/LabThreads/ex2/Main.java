package LabThreads.ex2;

public class Main {
    public static void main(String[] args) {
        VisionThread thread = new VisionThread();
        System.out.println("The thread before starting: " + thread.getState());
        thread.start();
        System.out.println("The thread after starting: " + thread.getState());
    }
}