package main.java.Chapter11.Multithreaded.Programming;

// creation of thread by extending Thread class should be used
// when methods in Thread class with be overwritten.  If not, just implement Runnable .
public class ExtendedThread extends Thread {

    public ExtendedThread() {
        super("ExtendedThread");
    }

    // run method is used to start thread.
    public void run() {
        try {
            for (int i = 0; i < 2; i++ ){
                System.out.println("Loop in " + this.getName() +" has run " + i + " times");
                Thread.sleep(700);
            }
        } catch (InterruptedException e){
            System.out.println("ExtendedThread was interrupted");
        }

    }

}
