package main.java.Chapter14.Generics;


//To specify the type of classes generic can accept.
// Defining an upper limit
public class IntGeneric<T extends Number> {
    T obj;

    public IntGeneric(T obj) {
        this.obj = obj;
    }

    T getValue() { return obj; }

    public void getType(){
        System.out.println("Object is of type " + obj.getClass().getName());
    }
}
