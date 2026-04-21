package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Thread {
    public static void main(String[] args) {
        // A thread in Java is a lightweight process that allows concurrent execution of code. 
        // It is a separate path of execution within a program, and multiple threads can run simultaneously, sharing the same memory space. 
        // Threads are used to perform tasks concurrently, improving the performance and responsiveness of applications.
        // In Java, you can create a thread by either extending the Thread class or implementing the Runnable interface.
        // The lifecycle of a thread includes several states: New, Runnable, Running, Blocked, Waiting, Timed Waiting, and Terminated.  
        // The thread starts in the New state when it is created. It transitions to the Runnable state when the start() method is called. 
        // The thread scheduler then decides when to move the thread to the Running state, where it executes its run() method.
        // Once the run() method completes, the thread transitions to the Terminated state.

        // Creating a thread by extending the Thread class
        class MyThread extends java.lang.Thread {
            @Override
            public void run() {
                System.out.println("Thread is running: " + java.lang.Thread.currentThread().getName());
            }
        }

        MyThread thread1 = new MyThread();
        thread1.start(); // Start the thread

        // Creating a thread by implementing the Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable thread is running: " + java.lang.Thread.currentThread().getName());
            }
        };

        java.lang.Thread thread2 = new java.lang.Thread(runnable);
        thread2.start(); // Start the thread
    }
    
}
