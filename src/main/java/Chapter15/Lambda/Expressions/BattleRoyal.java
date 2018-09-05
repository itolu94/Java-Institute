package main.java.Chapter15.Lambda.Expressions;

public class BattleRoyal {


    static double passLambda(BattleStrength bs) {
        System.out.print("Lambda function was used as an argument.... Value was ");
        return  bs.calculateStrength(12, 54.32);
    }

    public static void main (String args[]) {
        // define expression lambda
        // do not have to specify type of age, and weight.. their
        // types are inferred from the target context (functional interface)
        BattleStrength battleStrength = (age, weight) -> age * weight * Math.random();

        double Tommy =  battleStrength.calculateStrength(23, 32.32 );
        System.out.println("Tommy strength was calculated to be " + Tommy);

        int powerup = 2000;
        // define block lambda
        BattleStrength battleStrength1 = (age, weight) -> {
            System.out.println("Calculations are occurring");
            age = age +255 *323;
            weight = (weight / 323.32) * 755;
            System.out.println("Calculations have been completed");
            //can reference variables outside of lambda scope but
            // can not change their values
            if(Math.random() > 0.5) age += powerup;
            return age * weight;
        };

        double Jimmy =  battleStrength.calculateStrength(12, 54.32);
        System.out.println("Jimmy strength was calculated to be " + Jimmy);

        //passed lambda function to passLambda function.
        System.out.print(passLambda(battleStrength));
    }

}
