package main.java.Chapter5.Control.Statements;

public class JumpStatements {
    public static void main(String args []){
        //Three jump statements supported by java are 1.) break 2.) continue and 3.) return
        int [] intArr = {1,2,3,4};
        for(int value: intArr) {
            System.out.println("this line will only be ran once");
            break;
        }
        System.out.println("Loop transferred control over to me!!!!");
      // Break statement should be used to cancel a loop only when some sort of special situation occurs

        //break can be used to goto
        one: for(int i =1; i <10; i++){
            two: for(int j =1; j <10; j++) {
                three:  for(int k=0;k<100;k++){
                    System.out.println("Function will return control back to one");
                    break one;
                }
            }

        }
        System.out.println("I escaped the loop!");



        // continue can be used to stop a particular iteration
        // continue can be used as a goto, similar to how break statement was used.
        for(int value: intArr){
            if(value == 2) continue;
            System.out.println("current value is " + value);
        }
        System.out.println("Notice how 2 was skipped!");
    }

    // return causes program control to transfer back to the caller of the method
    // categorized as a jump statement.

}
