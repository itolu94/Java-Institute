package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations;

public class main {
    public static void main(String args[]){
        //declared variable that was defined in enumeration
        Characters Naruto = Characters.Naruto;
        // returns a list of the enumeration constants.
        for(Characters characters: Characters.values()) {
            System.out.print("Character name is " + characters + ".");
            System.out.print("  Power level is " + characters.getPowerLevel() + ".");
            //gets constant's position in enumeration array
            System.out.println("  Position in enumeration is " + characters.ordinal());
            System.out.println("Character is " + characters.compareTo(Characters.Tobi) + " positions from Tobi");
            System.out.println();
        }

        System.out.println("My favorite naruto character is " + Naruto);
        System.out.println(Characters.valueOf("Naruto"));
    }
}
