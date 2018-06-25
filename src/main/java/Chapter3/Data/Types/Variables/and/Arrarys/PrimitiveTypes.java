package main.java.Chapter3.Data.Types.Variables.and.Arrarys;

//      Java primitive types include,
public class PrimitiveTypes {
    public static void main(String args[]){
        // width of 8 bytes
        // useful when working with raw binary data
        byte byteExamples;

        // width of 16 bytes
        short shortExamples;

        // width of 32 bits
        // most commonly used integer type
        // all integer literals (byte, short, int, and long) create a int value
        int intExample;

        // can separate long values with underscore (_) or comma (,)
        intExample = 1_000_000 ; // converts to 1,000,000

        // width of 64 bytes
        // used when int is too small to hold value
        long longExample;

        // Use tailing L to signify long literal
        longExample = 1000L;

        // width of 32 bits
        // single-precision
        float floatExample;
        // Specify float literal with trailing F || f
        floatExample = 1.002F;

        // width of 64 bits
        // faster than single precision on some modern processors
        // transcendental math functions return double values
        // default floating-point literal in Java
        double doubleExample;

        // width of 16 bit
        // Unicode charter set
        // can be converted to int and manipulated with int operators
        // Refer to page 46 for useful character escape sequences
        char charExamplee;

        // does not convert to 0 (false) or 1 (true) like other languages(i.e. JavaScript)
        boolean booleanExxample;

        //Escapes sequences used for char (pg. 46) can be used in Strings
        //Not implemented as array of characters but as an Object
        String stringExample;
    }
}