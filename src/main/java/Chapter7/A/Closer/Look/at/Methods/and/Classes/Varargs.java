package main.java.Chapter7.A.Closer.Look.at.Methods.and.Classes;

//Method from book
public class Varargs {
    //Assure that each varargs arguments are not ambiguous (each one
    // clarifies one situation.  I.e (int ... i) (int i, int ...j)  -> compiler
    // would not be able to distinguish vaTest(1)
    static void vaTest (int ... v) {
        System.out.println("Number of args: " + v.length + " Contents: ");

        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    // can set args that are required and then store
    // remaining args in v
    // NOTE that varargs have to come last in the arg list.
    static void vaTest (double pointer, int ... v) {
        System.out.println("Number of args: " + v.length + " Contents: ");

        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args){
        vaTest(3,53,53);
    }
}
