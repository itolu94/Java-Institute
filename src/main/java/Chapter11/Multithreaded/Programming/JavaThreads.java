package main.java.Chapter11.Multithreaded.Programming;

import main.java.Chapter11.Multithreaded.Programming.Children.ExtendedThread;
import main.java.Chapter11.Multithreaded.Programming.Children.RunnableThread;

import static java.lang.Thread.NORM_PRIORITY;
import static java.lang.Thread.currentThread;

public class JavaThreads {
    /*
        Multithreading system in java is built upon the JavaThreads class and Runnable interface.
        Some methods defined in JavaThreads class
            1. getName - Obtain a thread's name
            2. getPriority - Obtain a thread's priority
            3. isAlive - Determine if a thread is still running
            4. join - Wait for a thread to terminate
            5. run - Entry point for the thread
            6. sleep - Suspend a thread for a period of time
            7. notify - Wakes up a thread that called wait() on the same object
            8. notifyAll = wakes up all threads that called wait() on the same object.
            9. start - Start a thread by calling its run method.
     */
    /*main method generates the main thread
      Child threads will be generated from main thread.
      main thread must typically be terminated last
     */
    public static void main(String args[]){
        // currentThread()  returns a reference to the thread it was ran on
        Thread t = currentThread();
        // will display Program is being executed on threadThread[main,5,main].  [name of thread, priority, group thread belongs too]
        System.out.println("Program is being executed on thread" + t);
        /* getState can return
            1. BLOCKED - A thread that has suspended execution because it is waiting to acquire a lock
            2. NEW - A thread that has not begun execution
            3. RUNNABLE - A thread that is running will run when it is granted CPU
            4. TERMINATE - A thread that has completed excecution
            5. TIMED_WAITING - a thread that is put on hold for a certain period of time (Thread.sleep(1000)
            6. WAITING - A thread that is waiting for some action to occur.

        */
        System.out.println("Thread state is " + t.getState());
        System.out.println("Thread is called " + t.getName());
        System.out.println("Thread ID is " + t.getId());
        System.out.println("Thread is alive: " + t.isAlive());
        RunnableThread r = new RunnableThread();
        ExtendedThread e = new ExtendedThread();
        e.start();
        r.startThread();
        // priority can be set to 1 (least priority) to 10 (highest priority)
        e.setPriority(7);
        //NORM_PRIORITY sets thread priority to default value of 5
        r.setThreadPriority(NORM_PRIORITY);
        System.out.println("ExtendedThread is alive: " + e.isAlive());
        System.out.println("RunnableThread is alive: " + r.threadIsAlive());

        try{
            for (int i = 0; i < 5; i++ ){
                System.out.println("Loop in " + t.getName() +" has run " + i + " times");
                t.sleep( 700);
            }
            //wait for e and r threads to terminate.
            e.join();
            r.joinThread();
            System.out.println("ExtendedThread is alive: " + e.isAlive());
            System.out.println("RunnableThread is alive: " + r.threadIsAlive());
        } catch (InterruptedException i){
            System.out.println("Main was interrupted");
        }
    }
}
