package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface Family {
    String familyName();
    // Can provide annotation with default value
    String species() default "human";
}
