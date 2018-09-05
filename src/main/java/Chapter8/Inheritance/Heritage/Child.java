package main.java.Chapter8.Inheritance.Heritage;

//Child is subclass of Parents(which is a superclass)
//Can only specify one superclass for any subclass
public class Child extends Parents {
    private int age = 13;
    private int income = 3200;
    private String lastName;

    //default constructor
    public Child() {

        //using super to get access to Parent.class lastName value.
        this.lastName = super.getLastName();
    }

    //Use super to call Parents.class constructor.
    public Child(int age) {
        //super can only be used to call the constructor of the immediate superclass
        super(age);
        this.lastName = super.getLastName();

    }

    // Overriding method found in superclass (Parents.class)
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getIncome() {
        return income;
    }

    @Override
    public void setIncome(int income) {
        this.income = income;
    }
}
