package multi_threading.labs;

public class ThreadController {

    public static void main(String[] args) {

        MyFirstRunnable one = new MyFirstRunnable("Runnable One - ", 1);
        MyFirstRunnable two = new MyFirstRunnable("Runnable Two - ", 5);
        MyFirstRunnable three = new MyFirstRunnable("Runnable Three - ", 10);

        MyFirstThread onet = new MyFirstThread("Thread One - ", 1);
        MyFirstThread twot = new MyFirstThread("Thread Two - ", 5);
        MyFirstThread threet = new MyFirstThread("Thread Three - ", 10);

        System.out.println("Main Method Complete.");

    }
}
