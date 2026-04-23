package Week_3___Multithreading_And_Spring_Boot.Day_17_ThreadPools_Concurrency_Deadlock.Deadlock;

public class Coffman_Conditions {
/* 
1. Mutual Exclusion  
2. Hold and Wait  
3. No Preemption  
4. Circular Wait  

All four must exist for deadlock.
*/
// Example of Coffman Conditions for Deadlock

public static void main(String[] args) {
    System.out.println("Coffman Conditions for Deadlock:");
    System.out.println("1. Mutual Exclusion: At least one resource must be held in a non-sharable mode.");
    System.out.println("2. Hold and Wait: A process must be holding at least one resource and waiting to acquire additional resources that are currently being held by other processes.");
    System.out.println("3. No Preemption: Resources cannot be preempted; they can only be released voluntarily by the process holding them.");
    System.out.println("4. Circular Wait: There must be a circular chain of processes where each process is waiting for a resource that is held by the next process in the chain.");

}
}
    
