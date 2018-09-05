package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Annotations.Family;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    Annotations have three different retention policies
        1. SOURCE - retained only in the source file and is discarded during compilations
        2. CLASS - stored in the .class file during compilation but not available through the JVM
        3. RUNTIME - stored in the .class file during compilation and is available through the JVM during runtime
    Use @Retention annotation to specify the annotations retention policy
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Prodigy {
    // All annotations consist solely of method declaration
    String name();
    int age();
    String occupation();
}
