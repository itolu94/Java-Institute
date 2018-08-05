package main.java.Chapter7.A.Closer.Look.at.Methods.and.Classes;

public class Strings {
    public static void main(String[] args){
        // Creates an object of type String and is immutable
        // Ue StringBuffer and StringBuilder as strings that are mutable.
        String a = "Java";
        String b = "Python";
        String c = a + b;
        System.out.print("String a is: " + a);
        System.out.println("String b is: " + b);
        System.out.println("Results of a.equals(b): " + a.equals(b));
        System.out.println("Results of a.length(): " + a.length());
        System.out.println("Results of a.charAt(2): " + a.charAt(2));
    }
}
