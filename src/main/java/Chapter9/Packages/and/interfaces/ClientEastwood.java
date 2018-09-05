package main.java.Chapter9.Packages.and.interfaces;

/*
  Since ClientEastwood class is decleared abstract, it
  does not have to implement all methods from Body.
 */
public abstract class ClientEastwood implements Body{

    // myAge method is implemented
    @Override
    public void myAge() {
        System.out.println("I am agless");
    }

    // myName method does not have to be implemented since
    // the class is declared abstract.
}
