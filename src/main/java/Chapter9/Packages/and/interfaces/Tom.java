package main.java.Chapter9.Packages.and.interfaces;

public class Tom implements Body {

    public Tom() {
    }

    /*
      Methods that are specified by Body interface are
      created.
      Methods implemented from Body interface have to be public
     */
    @Override
    public void myName() {
        System.out.println("My name is Tom");
    }

    @Override
    public void myAge() {
        System.out.println("I am 24 years old.");
    }

    public void myHobbies(){
        System.out.println("I like biking, swimming, and basketball.");
    }

    public void myBody(){
        //variabels arms and legs (both defined in body interface) can be referenced within Tom class
        // should we us interfaces this way.....  probably not.
        System.out.println("I have " + arms + " arms and " + legs + " legs");
    }
}
