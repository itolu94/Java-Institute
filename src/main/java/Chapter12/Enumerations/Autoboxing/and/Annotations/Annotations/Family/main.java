package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Annotations;

import java.lang.annotation.Annotation;

//implementing Family annotation
@Family(familyName = "America", species="human")
public class main {
    // implementing Prodigy annotation.
    @Prodigy(name = "James", age = 22, occupation = "Swimming")
    //default value for species will be used since it is not declared.  
    @Family(familyName = "America Diez")
    public static void Annotation() {

        try {
            main main = new main();
            // gets all annotations specified for main class.
            Annotation[] annotations = main.getClass().getAnnotations();
            for (Annotation a : annotations) {
                // wont print anything since retention time for Family annotation is not RUNTIME
                System.out.println("main class annotation" + a);
            }

            //gets all annotations used for Annotation method
            annotations = main.getClass().getMethod("Annotation").getAnnotations();
            for (Annotation a : annotations)
                System.out.println("Annotation method Annotation" + a);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static void main(String args[]){
        Annotation();
    }
}
