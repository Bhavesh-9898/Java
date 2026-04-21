package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Extending_Thread_Class {
    public static void main(String[] args) {
        // In Java, you can create a thread by extending the Thread class. 
        // To do this, you need to create a subclass of Thread and override the run() method, which contains the code that will be executed when the thread is started.

        // Example of extending the Thread class
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
