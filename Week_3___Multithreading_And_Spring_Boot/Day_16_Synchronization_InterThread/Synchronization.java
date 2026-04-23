package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;

// This code demonstrates the use of synchronization in Java for thread safety.
// The Counter class has a method increment() that is synchronized to ensure that only one thread can execute the block of code that increments the count variable at a time.
// Two threads are created to increment the counter 1000 times each, and the main thread waits for both threads to finish using join().
//Example of synchronization:

public class Synchronization {
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
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