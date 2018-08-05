package main.java.Chapter7.A.Closer.Look.at.Methods.and.Classes;

 public class Main {
    //global variable.. only one instance of it is created.
    static int a = 22;

    //Has public access
    public int b = 33;

    //only methods withing Main class can access this variable.
    private int c = 44;

    // value can not be changed
    // common convention to use all upper case for final variables.
    final int D = 66;

     //default modifier for class is public.  Class is visible within package.
    int E = 88;
    /*
    The use of static comes with certain restrictions
      1. They can only directly call other static methods of their cclass
      2. They can only directly access static variables of their class
      3. They cannot refer to this or super in any way.
     */
    public static void main(String[] args){

    }
}
