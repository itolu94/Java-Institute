package main.java.Chapter8.Inheritance.Heritage;

/*
Abstract class are used to specify variables and optionally methods.
Declarations are used as template for subclass and are not explicitly
defined in abstract class.
Abstract class cannot be instantiate.
 */
 abstract class Human {
     int age;
     String lastName;

     //abstract classes can have methods defined within them.
     final public void getSpecies(){
         System.out.println("I am a human");
     }
}
