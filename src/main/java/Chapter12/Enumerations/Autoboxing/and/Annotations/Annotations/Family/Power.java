package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Annotations.Family;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface Power {
    String value();
}
