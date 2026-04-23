package Week_3___Multithreading_And_Spring_Boot.Day_17_ThreadPools_Concurrency_Deadlock.Common_Thread_Pools;

public class newFixedThreadPool {

    // A fixed thread pool is a type of thread pool that creates a specified number of threads to execute tasks concurrently.
    // It is useful when you want to limit the number of concurrent threads and manage resources efficiently.
    // The fixed thread pool will reuse the threads for executing multiple tasks, and if all threads are busy, it will queue the tasks until a thread is available.
    // The number of threads in the pool is defined at the time of creation and cannot be changed dynamically.
    // Example usage:
    public static void main(String[] args) {
        System.out.println("newFixedThreadPool creates a thread pool with a fixed number of threads.");
        
    }
    
}
