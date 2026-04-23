package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;

// This code demonstrates the use of the wait() and notify() methods in Java for inter-thread communication.
// The waiter thread waits for a notification from the notifier thread before proceeding.
// Example of wait() method for inter-thread communication:

class wait_Keyword {
    private final Object lock = new Object();
    private boolean ready = false;

    public static void main(String[] args) {
        wait_Keyword demo = new wait_Keyword();
        demo.runDemo();
    }

    private void runDemo() {
        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                while (!ready) {
                    try {
                        System.out.println("Waiting...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println("Resumed after notification.");
            }
        });

        Thread notifier = new Thread(() -> {
            synchronized (lock) {
                ready = true;
                System.out.println("Notifying...");
                lock.notify();
            }
        });

        waiter.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        notifier.start();
    }
}