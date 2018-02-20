package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */


public class MyFirstRunnable implements Runnable {

   Thread thread;

   MyFirstRunnable(String name, int priority) {
       thread = new Thread(this, name);
       thread.setPriority(priority);
       thread.start();

   }

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.print(thread.getName());
            System.out.println(i);

        }
    }
}

