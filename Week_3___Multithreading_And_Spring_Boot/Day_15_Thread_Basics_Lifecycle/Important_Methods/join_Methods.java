package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle.Important_Methods;

public class join_Methods {
    public static void main(String[] args) {
        // The join() method in Java is used to wait for a thread to complete its execution before the current thread continues. 
        // It is a non-static method of the Thread class and can be called on a thread instance. 
        // When a thread calls the join() method on another thread, it will block until the other thread has finished executing.

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running...");
            try {
                Thread.sleep(2000); // Simulate some work by sleeping for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread 1 was interrupted.");
            }
            System.out.println("Thread 1 has finished.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
            try {
                Thread.sleep(1000); // Simulate some work by sleeping for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread 2 was interrupted.");
            }
            System.out.println("Thread 2 has finished.");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting.");
        }

        System.out.println("Both threads have finished. Main thread is exiting.");
    }
    
}
