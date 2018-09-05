package main.java.Chapter10.Exeption.Handling;

public class Throw {
    public static void main(String args[]){
        try{
            throw new IncompatibleClassChangeError("testing");
        }
        catch(IncompatibleClassChangeError e) {
            System.out.println("error was caught");
        }
        try{
            //method returns IncompatibleClassChangeError that is handled by catch statement
            pitcher(2);
        }
        // catch can be set upt to .... catch different types of errors
        catch (ClassNotFoundException | InstantiationError | NoSuchFieldError e ) {
            System.out.println("ClassNotFoundException was caught");
        }

        // finally is ran after try and catch block whether it throws an error or not
        finally{
            System.out.println("Inside finally block");
        }

    }
    //throws clause list the types of exception the method could throw
    static void pitcher(int error) throws ClassNotFoundException, InstantiationError, NoSuchFieldError {
        switch (error){
            case 1:
                throw new ClassNotFoundException();
            case 2:
                throw new InstantiationError();
            case 3:
                throw new NoSuchFieldError();
            default:
                System.out.println("Please enter a number 1-3 to get an error..");
        }
    }
}


