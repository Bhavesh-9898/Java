package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Thread_Lifecycle {

    public static void main(String[] args) {
        // The lifecycle of a thread in Java consists of several states: New, Runnable, Running, Blocked, Waiting, Timed Waiting, and Terminated.

        // 1. New: A thread is in the new state when it is created but not yet started. 
        //    Example: Thread thread = new Thread();

        // 2. Runnable: A thread is in the runnable state when it is ready to run but is waiting for the CPU to schedule it. 
        //    Example: thread.start();

        // 3. Running: A thread is in the running state when it is executing its run() method.

        // 4. Blocked: A thread is in the blocked state when it is waiting for a monitor lock to enter a synchronized block or method.

        // 5. Waiting: A thread is in the waiting state when it is waiting indefinitely for another thread to perform a specific action (e.g., calling wait()).

        // 6. Timed Waiting: A thread is in the timed waiting state when it is waiting for a specified amount of time (e.g., calling sleep()).

        // 7. Terminated: A thread is in the terminated state when it has completed its execution or has been terminated by an exception.

        // Example of thread lifecycle
        class MyThread extends java.lang.Thread {
            @Override
            public void run() {
                System.out.println("Thread is running...");
                try {
                    java.lang.Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread is terminating...");
            }
        }   
    }

    
}
