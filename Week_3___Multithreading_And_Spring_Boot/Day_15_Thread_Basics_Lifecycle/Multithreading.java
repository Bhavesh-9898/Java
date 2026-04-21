package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Multithreading {
    public static void main(String[] args) {
        // Multithreading is a programming concept that allows multiple threads to run concurrently within a single program. 
        // Each thread represents a separate path of execution, and they can run simultaneously, sharing the same memory space. 
        // Multithreading is used to improve the performance and responsiveness of applications by allowing tasks to be executed in parallel.

        // In Java, you can create and manage threads using the Thread class or the Runnable interface. 
        // The Thread class provides methods for creating, starting, and managing threads, while the Runnable interface allows you to define the code that will be executed by a thread.

        // Example of creating and starting multiple threads
        class MyThread extends java.lang.Thread {
            private String name;

            public MyThread(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " is running: " + i);
                }
            }
        }

        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
    
}
