package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle.Important_Methods;

public class run_Methods {
    public static void main(String[] args) {
        // The run() method in Java is the entry point for a thread's execution. 
        // When you create a thread by extending the Thread class or implementing the Runnable interface, you need to override the run() method to define the code that will be executed when the thread is started.

        // Example of using the run() method
        class MyThread extends java.lang.Thread {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        }

        MyThread thread = new MyThread();
        thread.run(); // This will execute the run() method in the current thread, not in a new thread
    }
    
}
