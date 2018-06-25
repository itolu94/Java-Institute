package main.java.Chapter3.Data.Types.Variables.and.Arrarys;

public class TypeConversionAndCasting
{

    public static void main(String args[]){

    /*
    Automatic type conversion, specifically a widening conversion will occurs if
        1. The two types are compatible (int -> long , short -> int, etc.)
        2. The destination type is larger than the source type (
     */

    /*
    Casting Incompatible types
    Narrowing conversion is a conversion between two incompatible types, you mut use a cast.
    truncation conversion occurs when a floating point is converted to int (decimal is lost)
     */
    int intExample= 20;
    double doubleExample = 23.9393;
    // Narrowing conversion performed a cast to convert int -> byte;
    byte byteExample = (byte) intExample;

    // narrowing conversion
    int intExampleTwo = (int) doubleExample;

        /*
    Type Promotions
        1. byte, short, and char values are promoted to int
        2. if one operand is an long, the whole expression is promoted to long
        3. if one operand is an float, the whole expression is promoted to float
        4. if one operand is an double, the whole expression is promoted to double
     */
    }
 }
