package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;

// This code demonstrates the use of intrinsic locks (monitors) in Java for thread synchronization.
// The Counter class has a method increment() that is synchronized using the intrinsic lock of the Counter instance (this).
// Two threads are created to increment the counter 1000 times each, and the main thread waits for both threads to finish using join(). 
// Intrinsic Lock (Monitor) Example:

public class Intrinsic_Lock_Monitor {
    static class Counter {
        private int count = 0;

        public void increment() {
            synchronized (this) { // Intrinsic lock monitor
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}