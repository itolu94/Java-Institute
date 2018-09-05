package main.java.Chapter12.Enumerations.Autoboxing.and.Annotations.Enum;

//use of keyword enum creates enumeration.

public enum Characters {
    //enumeration constants.  implicitly declared as a public, static final member.
    // are constants to the Character object.
    Naruto(5000, true),  Sakura(2000), Tobi(3985), Madara(7059), Lee(3769);
    private int powerLevel;
    private boolean useful;

    //constructors can be overloaded in enums
    Characters(int powerLevel, boolean useful) {
        this.powerLevel = powerLevel;
        this.useful = useful;
    }

    Characters(int powerLevel) {
        this.powerLevel = powerLevel;
        this.useful = false;
    }

    Characters() {
        this.powerLevel = 500;
        this.useful = false;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public boolean isUseful() {
        return useful;
    }

}
