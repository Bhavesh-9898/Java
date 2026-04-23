package Week_3___Multithreading_And_Spring_Boot.Day_17_ThreadPools_Concurrency_Deadlock.Common_Thread_Pools;

public class newCachedThreadPool {

    // A thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
    // These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks. 
    // Calls to execute will reuse previously constructed threads if available. 
    // If no existing thread is available, a new thread will be created and added to the pool. 
    // Threads that have not been used for sixty seconds are terminated and removed from the cache. 
    // Thus, a pool that remains idle for long enough will not consume any resources.
    // Note that pools with similar properties but different details (for example, timeout parameters) may be created using ThreadPoolExecutor constructors.
    // Note: If the application needs to be kept running, the main thread should not be terminated immediately after submitting tasks to the thread pool.
    // To prevent the main thread from terminating, you can use various approaches such as:
    // 1. Using CountDownLatch or other synchronization mechanisms to wait for tasks to complete before allowing the main thread to exit.
    // 2. Using Thread.sleep() to keep the main thread alive for a certain period of time, although this is not recommended for production code as it can lead to inefficient resource usage.
    // 3. Using an infinite loop or other blocking mechanism to keep the main thread running until a specific condition is met (e.g., waiting for user input or a shutdown signal).
    // It's important to ensure that the main thread remains active while the thread pool is executing tasks, especially if the tasks are asynchronous and may take some time to complete.
    public static void main(String[] args) {
        System.out.println("newCachedThreadPool creates a thread pool that creates new threads as needed but will reuse previously constructed threads when they are available.");

    }
    
}
