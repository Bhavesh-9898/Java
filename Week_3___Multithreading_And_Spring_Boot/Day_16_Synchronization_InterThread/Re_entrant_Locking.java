package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;

// This code demonstrates the use of ReentrantLock in Java for thread synchronization.
// The Counter class has a method increment() that uses a ReentrantLock to ensure that only one thread can execute the block of code that increments the count variable at a time.
// Two threads are created to increment the counter 1000 times each, and the main thread waits for both threads to finish using join().
//Example of ReentrantLock:

import java.util.concurrent.locks.ReentrantLock;    
public class Re_entrant_Locking {
    static class Counter {
        private int count = 0;
        private final ReentrantLock lock = new ReentrantLock();

        public void increment() {
            lock.lock(); // Acquire the lock
            try {
                count++;
            } finally {
                lock.unlock(); // Release the lock
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