package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle.Important_Methods;

public class sleep_Methods {
    public static void main(String[] args) {
        // The sleep() method in Java is used to pause the execution of the current thread for a specified period of time. 
        // It is a static method of the Thread class and can be called using Thread.sleep(milliseconds). 
        // The sleep() method throws an InterruptedException if the thread is interrupted while sleeping.

        System.out.println("Thread is going to sleep for 2 seconds...");
        try {
            Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping.");
        }
        System.out.println("Thread has woken up.");
    }
    
}
