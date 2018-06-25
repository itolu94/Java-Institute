package main.java.Chapter3.Data.Types.Variables.and.Arrarys;

public class Arrarys {
    public static void main(String args[]){
        // Arrays are used to group like-typed variables under a common name

        // one-dimensional array is a list of like-typed variables
        int intArrary [];  // Array can only hold variables that are of type int

        // Actually creating int array/allocating memory for array
        intArrary = new int[20];
        int [] intArrayTwo = new int[20];
        /*
        Array can only hold 20 values, each initially have a value of 0, false, or null.
        A run-time error will occur if an index that is larger than array is accessed,
        */

        // Declaring and initialization an array
        int secondIntArray []= new int [20];

        // Can declare array variables when initialization
        int thridIntArrary [] = new int[] {1,2,3,4,5,6,7,8,9,10};



         // Multidimensional Arrays are arrays of arrays
         int twoD [][] = new int[2][4];   // Create a 2 X 4 array

        // Do not have to specify the size of the right array
        int twoDtwo [][] = new int [5][];
        twoDtwo[0] = new int [4]; //this line will work from index 0-4
    }
}
