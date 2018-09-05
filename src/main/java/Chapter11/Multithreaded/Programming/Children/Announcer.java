package main.java.Chapter11.Multithreaded.Programming.Children;

public class Announcer {
    // keyword synchronized assures that thread can only be called one thread at a time
    synchronized public void finished(String threadName){
            System.out.println(threadName + " has finished running");
    }
}
