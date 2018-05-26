package main.java.Chapter2.An.Overview.of.Java;

public class Overview {
    public static void main(String args[])
    {
        // Simple System.out.println (sout)
        System.out.println("This is a simple Java Program ");

        // Can sout variables
        int num;
        num = 100;
        System.out.println("this is a num: " + num);

        num = num * 10;

        //System.out.println  does not output newline character at the end of the string
        System.out.print("this is a num * 10: ");
        System.out.println(num);

    }
}