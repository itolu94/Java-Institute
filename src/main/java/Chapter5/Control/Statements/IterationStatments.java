package main.java.Chapter5.Control.Statements;

public class IterationStatments {
    public static void main(String args []){
        /*
        Java has three iteration statements (for, while, and do-while)
         */

        //while loop is the most fundamental loop statement
        int integer = 5;
        while(integer >4 ) {
            integer--;
            System.out.println("Line will only be ran once");
        }
        //COOL FACT: while loop does not need a body
        int highInt = 100;
        int lowInt =75;
        while(--highInt > ++lowInt);
        System.out.println("HighInt is "  + highInt);
        System.out.println("lowInt is "  + lowInt);

        /*
         do-while loops checks the condition for the loop last
         this allows for the loop body to run at least once
       */
        integer = 5;
        do{
            System.out.println("I will only run once... even though I shouldn't");
        } while (integer < 4);


        // For loop is very powerful and useful iteration statement

        //First form - traditional form
        for(int intExample = 0, intExampleTwo = 20; intExample < 2; intExample++){
            System.out.println("Traditional for loop was ran " + intExample + " times.");
        }

        //Second form- for-each (enhanced for loop) form
        //Cycles through entire array, obtaining one element at a time, in sequence.
        int [] intArray = {1,2,3};
        for(int num: intArray) System.out.println("for-each loop is now on number " + num);
        //Note, can not change the values within the array when using this version of the for loop

    }
}

