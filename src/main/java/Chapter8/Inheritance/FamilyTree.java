package main.java.Chapter8.Inheritance;

import main.java.Chapter8.Inheritance.Heritage.Child;

public class FamilyTree {
    public static void main(String args[]){
        Child tom = new Child();

        /*
        class Child does not explicitly state lastName but
        superclass(parent) has the variable.
         */
        System.out.println("Tom's last name is " + tom.getLastName());
    }
}
