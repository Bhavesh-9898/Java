package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle.Important_Methods;

public class start_Methods {
    public static void main(String[] args) {
        // The start() method in Java is used to start a thread. 
        // When you call the start() method on a Thread object, it causes the thread to begin execution and calls the run() method of that thread.

        // Example of using the start() method
        class MyThread extends java.lang.Thread {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        }

        MyThread thread = new MyThread();
        thread.start(); // This will call the run() method and execute the thread
    }
    
}
