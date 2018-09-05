package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Annotations.Family;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Family {
    String familyName();
    // Can provide annotation with default value
    String species() default "human";
}
