package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.TypeWrappers;

//demonstration wrappers for java primitive types
public class TypeWrappers {
    public static void main(String args[]) {
        // Character and Boolean object has been deprecated as of JDK 9
        Character c = 'a';
        Boolean legal = false;
        Boolean stillLegal = Boolean.valueOf("false");

        /*
        Numeric Type Wrappers
            1. Byte
            2. Short
            3. Integer
            4. Long
            5. Float
            6. Double

        All of the numeric type wrappers inherit the abstract class Number.
        Number class declares the following methods
            1. byte byteValue
            2. double doubleValue
            3. float floatValue
            4. int intValue
            5. long longValue
            6. short shortValue
         */
        Integer integerExample = 23;
        Integer integerExampleTwo = Integer.valueOf("32");
        System.out.println(".byteValue = " + integerExample.byteValue());
        System.out.println(".doubleValue = " + integerExample.doubleValue());
        System.out.println(".floatValue = " + integerExample.floatValue());
        System.out.println(".longValue = " + integerExample.longValue());
        System.out.println(".shortValue = " + integerExample.shortValue());

        System.out.println("Integer.valueOf('323') = " + Integer.valueOf("323"));


    }

}
