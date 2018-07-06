package main.java.Chapter11.Multithreaded.Programming;

// any object that implements Runnable can be a thread
public class RunnableThread implements Runnable{
    Thread t;
    //
    public RunnableThread() {
       // this is used to reference RunnableThread obj as the thread.  Also indicates we want the run() method to be used.
         t = new Thread(this, "RunnableThread");
    }

    // run method is used to start thread.
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++ ){
                System.out.println("Loop in " + t.getName() +" has run " + i + " times");
                t.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("RunnableThread was interrupted");
        }

    }
    public void startThread(){
        t.start();
    }

    public void joinThread() {
        try{
            t.join();
        } catch (InterruptedException e) {
            System.out.print("Error in t.join() ");
            e.printStackTrace();
        }
    }
    public boolean threadIsAlive() {
        return t.isAlive();
    }

    public void setThreadPriority(int priority) {
        t.setPriority(priority);
    }
}
