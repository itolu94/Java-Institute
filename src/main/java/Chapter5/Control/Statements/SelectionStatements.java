package main.java.Chapter5.Control.Statements;

public class SelectionStatements {
    public static void main(String args[]) {
        /*
        - Java supports two selection statements
            1. if
            2. switch
         */
        int IntExm = 20;
        if (IntExm == 20) {
            System.out.println("IntExm was equal to 20");
        }

        /*
        prior to JDK 7, switch expression could on be type byte, short, int, or char or enumeration
        Begging with JDK 7, switch expressions can now  be type String (More expensive than switching on Int)
         Only use switch statements controlled with String type sparingly
        */
        //switch statement is typically more efficient than nested ifs
        switch (IntExm) {
            case 10:
                System.out.println("Int was 10");
                break;
            case 20:
                System.out.println("Int was 20");
                break;
            default:
                System.out.println("Int was neither 10 or 20 but was" + IntExm);
        }
    }
}
