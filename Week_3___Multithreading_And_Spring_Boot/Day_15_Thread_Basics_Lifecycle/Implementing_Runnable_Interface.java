package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Implementing_Runnable_Interface {
    public static void main(String[] args) {
        // In Java, you can also create a thread by implementing the Runnable interface. 
        // To do this, you need to create a class that implements the Runnable interface and override the run() method, which contains the code that will be executed when the thread is started.

        // Example of implementing the Runnable interface
        class MyRunnable implements java.lang.Runnable {
            private String name;

            public MyRunnable(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " is running: " + i);
                }
            }
        }

        java.lang.Thread thread1 = new java.lang.Thread(new MyRunnable("Thread 1"));
        java.lang.Thread thread2 = new java.lang.Thread(new MyRunnable("Thread 2"));

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
    
}
