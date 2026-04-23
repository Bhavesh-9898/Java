package Week_3___Multithreading_And_Spring_Boot.Day_16_Synchronization_InterThread;
// This code demonstrates the use of the notify() method in Java for inter-thread communication.
// The Producer thread produces items and notifies the Consumer thread when an item is produced.    
// The Consumer thread waits for a notification from the Producer thread before consuming an item.
// Example of notify() method for inter-thread communication:

public class notify_Keyword {
    static class SharedResource {
        private boolean itemProduced = false;

        public synchronized void produce() {
            while (itemProduced) {
                try {
                    wait(); // Wait until the item is consumed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Item produced");
            itemProduced = true;
            notify(); // Notify the consumer that an item is produced
        }

        public synchronized void consume() {
            while (!itemProduced) {
                try {
                    wait(); // Wait until an item is produced
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Item consumed");
            itemProduced = false;
            notify(); // Notify the producer that the item is consumed
        }
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}