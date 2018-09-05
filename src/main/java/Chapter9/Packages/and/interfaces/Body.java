package main.java.Chapter9.Packages.and.interfaces;


/*
   interfaces are designed to support dynamic method resolution at run time.
 */
public interface Body {
    /*
      Variables that are declared in interface are
      implicitly public static final.
     */
    int arms = 2;
    int legs = 2;

    /*
    declaring abstract methods (methods with no body)
    methods are implicitly public.
     */
    void myName();
    void myAge();

    //can declare default methods for interfaces
    default void mySpecies(){
        System.out.println("I am part of the human species.");
    }

}
