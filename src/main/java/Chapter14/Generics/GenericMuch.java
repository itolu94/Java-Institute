package main.java.Chapter14.Generics;


//T is the Type Parameter.
public class GenericMuch <T, O> {
    T obj1;
    O obj2;

    public GenericMuch(T object1, O object2) {
        obj1 = object1;
        obj2 = object2;
    }

    T getobjValue(){
        return obj1;
    }

    O getob2Value(){
        return obj2;
    }

    public void getobjsType(){
        System.out.println("obj is of type " + obj1.getClass().getName());
        System.out.println("obj2 is of type " + obj2.getClass().getName());
    }
}
