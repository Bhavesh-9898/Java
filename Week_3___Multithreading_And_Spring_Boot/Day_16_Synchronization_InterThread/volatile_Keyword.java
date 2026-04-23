package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;

// This code demonstrates the use of the volatile keyword in Java for thread visibility.
// The Worker class has a volatile boolean variable 'running' that is used to control the execution of the worker thread. The main thread can stop the worker thread by setting 'running' to false, and this change is immediately visible to the worker thread due to the volatile keyword.
// Example of volatile keyword for thread visibility:

public class volatile_Keyword {

    private static class Worker extends Thread {
        private volatile boolean running = true;
        private long counter = 0;

        @Override
        public void run() {
            while (running) {
                counter++;
            }
            System.out.println("Worker stopped. Counter = " + counter);
        }

        public void stopWorker() {
            running = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(1000); // Let worker run for a second
        worker.stopWorker(); // Visible immediately because 'running' is volatile
        worker.join();

        System.out.println("Main thread finished.");
    }
}