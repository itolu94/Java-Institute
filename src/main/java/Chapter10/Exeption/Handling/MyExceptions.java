package main.java.Chapter10.Exeption.Handling;

public class MyExceptions {
    // Exception class does not define any methods of its own but inherits methods from superclass Throwable.
            /*
                Methods Defined in Throwable class
                    1. void addSuppressed(Throwable exc)
                    2. Throwable fillInStackTrace()
                    3. Throwable getCause()
                    4. String getLocalizedMessage()
                    5. String getMessage()
                    6. StackTraceElement[] getStackTrace()
                    7. finalThrowable[] getSuppressed()
                    8. Throwable initCause(Throwable exc)
                    9. void printStackTrace()
                    10. void printStackTrace(PrintStream stream)
                    11. void printStackTrace(PrintWriter stream)
                    12. void setStackTrace(StackTraceElement elements[])
                    13. String toString()

             */
    String message;

    public MyExceptions(String message) {
        this.message = message;
    }

    public String toString(){
        return "Error was " + this.message;
    }

}
