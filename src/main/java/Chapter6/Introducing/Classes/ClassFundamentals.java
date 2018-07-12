package main.java.Chapter6.Introducing.Classes;


// data is encapsulated in ClassFundamentals.class
public class ClassFundamentals {

    public static void main(String args[]){
        /*
        Classes are templates for an object
        Objects are instance of a class
         */

        // variables inside class are called instance variables or members of the class.
        // variable is recreated for each new instance of the class
        String instanceVariable = "Hello Class";

        /*
        constructor for Car object is called.
        It creates an instance of Car.
        dynamically allocates memory for Car object during run time.
        and returns a reference to it.
        */
        Car myCar = new Car();

        // use the dot operator (AKA separator) to access Car variables and methods
        myCar.wheels = 4;
        myCar.doors = 2;
        myCar.brand = "Toyota";
        System.out.println("I drive a " + myCar.brand + " that has " + myCar.doors + "doors");


        //Below function creates a copy of the reference to myCar object.
        Car mySecondCar = myCar;

        //alternative to the above code.
        Car myThirdCar = new Car(3, 2, "Hybrid");
        // pass argument to setBrand method
        myThirdCar.setBrand("Nissan");
        myThirdCar.setDoors(4);
        myThirdCar.setWheels(4);
        System.out.println("I drive a " + myCar.getBrand() + " that has " + myCar.getDoors()+ "doors");

    }


}

