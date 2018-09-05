package main.java.Chapter14.Generics;


//T is the Type Parameter.  
public class Generic<T> {
    T ob;

    public Generic(T ob) {
        this.ob = ob;
    }

    public void getValue(){
        System.out.println("Object has a value of " + ob.toString());
    }

    public void getType(){
        System.out.println("Object is of type " + ob.getClass().getName());
    }

}
