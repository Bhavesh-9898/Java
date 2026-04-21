package Week_3___Multithreading_And_Spring_Boot.Day_15_Thread_Basics_Lifecycle;

public class Callable__Future {
    public static void main(String[] args) {
        // In Java, the Callable interface is similar to the Runnable interface, but it allows you to return a result and throw a checked exception. 
        // The Callable interface has a single method, call(), which returns a value and can throw an exception.

        // Example of using Callable and Future
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();

        java.util.concurrent.Callable<String> callableTask = () -> {
            java.lang.Thread.sleep(2000L); // Simulate a long-running task
            return "Task completed!";
        };

        java.util.concurrent.Future<String> future = executor.submit(callableTask);

        try {
            System.out.println("Waiting for the task to complete...");
            String result = future.get(); // This will block until the task is completed
            System.out.println("Result: " + result);
        } catch (java.util.concurrent.ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
    
}
