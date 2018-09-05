package main.java.Chapter10.Exeption.Handling;

public class Error {
    /*Exception handling is handled by
        1. try - contains code that should be ran.  Errors COULD be generated in these sections.
        2. catch - errors can be caught within catch block.
        3. throw - to generate a manually created error.
        4. throws  - to generate a error that is thrown out of a method.
        5. finally - use to run code that must run after try block.
     */
    public static void main(String args[]){
        try{
            int a = 10;
            int b = 0;
            // line below will throw error
            int c = a/b;
        }
        //error will be caught bye one of the catch blocks
        // exception subclass should be used first before superclass (Exception class)
        catch (ArithmeticException e ) {
            // scope of catch is restricted to those statements specified preceding try statement
            System.out.println("Error was caught" + e);
    //        System.out.println("Error was caught" + e.getMessage());
        }
        // multiple catch blocks can be used for one try block
        catch (Exception e) {
            System.out.println("An errror was caught");
        }
    }
    // To create an Throwable error, create a class that extends Exception
    public class MyException extends Exception{

    }
}
