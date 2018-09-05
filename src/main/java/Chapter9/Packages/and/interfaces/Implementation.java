package main.java.Chapter9.Packages.and.interfaces;

public class Implementation {
    public static void main(String args[]){
        // Since class tom implements Body, we can use it as a reference.
        // it will only have access to
        Body c = new Tom();
        c.myAge();
        // does not give access to methods non implemeneted methods decleared in tom
        // c.myHobbies  --> will not have access to myHobbies
        Tom d = new Tom();
        d.myHobbies(); // --> has access to myHobbies
    }
}
