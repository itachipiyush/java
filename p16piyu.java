/*
Write a program to demonstrate creation of multiple child threads.
 */
class ChildThread extends Thread {
    private int threadNumber;

    public ChildThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Child thread " + threadNumber + " is running");
    }
}

public class p16piyu {
    public static void main(String[] args) {
        int numberOfThreads = 5;

        for (int i = 1; i <= numberOfThreads; i++) {
            ChildThread thread = new ChildThread(i);
            thread.start();
        }
    }
}
