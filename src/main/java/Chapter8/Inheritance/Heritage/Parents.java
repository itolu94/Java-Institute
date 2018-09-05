package main.java.Chapter8.Inheritance.Heritage;

import main.java.Chapter8.Inheritance.Heritage.Human;

/*
Extends abstract class Human.
Human abstract class assures age and lastName are used in subclass(Parents)
*/
public class Parents extends Human {
    private int age = 52;
    private int income = 52000;
    private String lastName = "Smiths";

    public Parents() {}

    public Parents(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
