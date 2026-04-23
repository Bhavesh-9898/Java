package Week_3___Multithreading_And_Spring_Boot.Day_17_ThreadPools_Concurrency_Deadlock;

public class shutdown {
    public static void main(String[] args) {
        System.out.println("In Java, you can shut down a thread pool gracefully or forcefully.");
        System.out.println("1. Graceful Shutdown: Use the shutdown() method to stop accepting new tasks and allow existing tasks to complete.");
        System.out.println("2. Forceful Shutdown: Use the shutdownNow() method to attempt to stop all running tasks and return a list of tasks that were awaiting execution.");
        System.out.println("3. Custom Shutdown: Implement a custom shutdown mechanism based on your application's specific requirements.");
        
    }
    
}
