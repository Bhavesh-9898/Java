package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle.Important_Methods;

public class yield_Methods {
    public static void main(String[] args) {
        // The yield() method in Java is used to pause the execution of the current thread and allow other threads of the same priority to execute. 
        // It is a static method of the Thread class and can be called using Thread.yield(). 
        // The yield() method does not guarantee that the current thread will pause or that other threads will execute immediately, as it depends on the thread scheduler.

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 is running...");
                Thread.yield(); // Yield to allow other threads to execute
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 is running...");
                Thread.yield(); // Yield to allow other threads to execute
            }
        });

        thread1.start();
        thread2.start();
    }
    
}
