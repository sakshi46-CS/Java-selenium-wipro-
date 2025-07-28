package Day7;

public class Multithreading2 {

    // Static nested classes
    static class Mul3 implements Runnable {
        public void run() {
            for (int i = 0; i <= 100; i++) {
                System.out.println("Java selenium batch");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Mul4 implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Multithreading is being started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        // Thread 1
        Runnable multithread = new Mul3();
        Thread t1 = new Thread(multithread);
        t1.start();

        // Thread 2
        Runnable multithread1 = new Mul4();
        Thread t2 = new Thread(multithread1);
        t2.start();
    }
}
