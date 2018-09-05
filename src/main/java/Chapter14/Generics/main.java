package main.java.Chapter14.Generics;

public class main {
    public static void main(String args[]) {

        Generic <String>  stringGeneric = new Generic<String>("Created a string generic");
        Generic <Integer> integerGeneric = new Generic<Integer>(85);
        //stringGeneric's value and type
        stringGeneric.getValue();
        stringGeneric.getType();

        //integerGeneric's value and type
        integerGeneric.getValue();
        integerGeneric.getType();

        GenericMuch<String, Integer> stringAndIntegerGeneric = new GenericMuch<String, Integer>("I'm super generic", 24);

        String value = stringAndIntegerGeneric.getobjValue();
        System.out.println("String value in stringAndIntegerGeneric is: :" + value);

        int value2 = stringAndIntegerGeneric.getob2Value();
        System.out.println("Integer value in stringAndIntegerGeneric is :" + value2);

        stringAndIntegerGeneric.getobjsType();
    }
}
