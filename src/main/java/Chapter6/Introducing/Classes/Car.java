package main.java.Chapter6.Introducing.Classes;

// data is encapsulated in Car.class
public class Car {



    //instance variables
    int wheels;
    int doors;
    String brand;

    /*
      constructor that is called when Car class is instantiated.
      Since instance variables were not given a value
      within constructor, they will be give zero, null, and false
      for int, ref types, and boolean, respectively.
     */
    public Car(int wheels, int doors, String brand) {
        /*
        'this' is required to access instance variables wheels, doors, and
        brand.  If it was not present, the constructor would not have access to
        and the instance variable would essentially be
         invisible. This is due to parameters sharing the same name as the instance variables.
         */
        this.wheels = wheels;
        this.doors = doors;
        this.brand = brand;
    }

    /*
    If no constructor is provided, or no variables are passed
    when object is instantiated, Java uses the default constructor (which is the one below)
     */
    public Car() {
    }

    //instance methods
    public int getWheels() {
        return wheels;
    }



    // methods states parameters that are required and the return type (void, int, String, ect.
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
