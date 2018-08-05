package main.java.Chapter7.A.Closer.Look.at.Methods.and.Classes;

public class House {
    /*
 Java access modifiers are public, private,
  and protected(only applied when inheritance is involved
  */
    // These variables can only be accessed within this class
    private int rooms;
    private int squareFeet;
    private String streetName;

    /*
    Java uses the type and/or the number of arguments to
    determine which version of an overloaded method should be invoked.
    */
    /*
      Overloaded constructor method.  Each method is unuiqe because
      of the parameters each one takes
      (first method takes not parameters while the second takes in
      three parameters)
     */
    public House() {
    }

    public House(int rooms, int squarFeet, String streetName) {
        this.rooms = rooms;
        this.squareFeet = squarFeet;
        this.streetName = streetName;
    }
    // if not exact match is found, java will use type conversion
    //  to find an exact match.



    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
