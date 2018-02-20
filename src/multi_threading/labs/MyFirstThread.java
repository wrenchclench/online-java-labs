package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 *

**/



class MyFirstThread extends Thread {

    public MyFirstThread (String name, int priority) {
        super(name);
        setPriority(priority);
        start();
    }

    @Override
    public void run () {

        for (int i = 0; i < 100; i++) {
            System.out.print(getName());
            System.out.println(i);

        }
    }
}

