
package Threads;

/**
 * Threads
 * This example will calculate the digits of PI using Threads, Executors, Handlers,
 * and Runnables
 * @author Dan
 */
public class Threads implements Runnable {
    // Variables
    private Thread t;
    private String threadName;
    private int numDigits;
    
    // Constructor
    Threads(int numDigits, String threadName) {
        this.numDigits = numDigits;
        this.threadName = threadName;
    }
    
    
    public static void main(String[] args) {
        // Varibales
        int numDigits = 2000000;
        String threadName = "Thread1";
        
        // Create the thread and run it
        Threads t = new Threads(numDigits, threadName);
        new Thread(t).start();
    }
    
 /**
 * run
 * Calculates the number of digits of PI
 * input: numDigits
 * output: PI
 * @author Dan
 */
    public void run() {
        System.out.println("Starting Thread: " + threadName);
        double pi = 0.0;
        // PI is calculated as: PI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 ... + 1/2n-1 - 1/2n+1
        // We will use a for loop using the number of digits wanted
        // NOTE: PI becomes more accurate for more digits calculated
        for (int i = 1; i < numDigits; i+= 2) {
            pi = pi + ((1.0 / (2.0 * i - 1)) - (1.0 / (2.0 * i + 1)));
        }
        pi *= 4.0;
        
        // Display PI
        System.out.println("PI = " + pi);
    }
}
