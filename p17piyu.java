/*
Write a program creating 2 threads using Runnable interface.
Print your name in ``run ()`` method of first class and "Hello Java" in ``run ()`` method of second thread.
 */
class NameThread implements Runnable {
    public void run() {
        System.out.println("Piyush");
    }
}

class HelloThread implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}

public class p17piyu {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NameThread());
        Thread thread2 = new Thread(new HelloThread());

        thread1.start();
        thread2.start();
    }
}
