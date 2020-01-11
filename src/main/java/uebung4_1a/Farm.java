package uebung4_1a;

public class Farm {
    public static void main(String[] args) {

        // From Uebung 3
        Cow cow1 = new Cow("Berta");
        Cow cow2 = new Cow("Hilde");
        Cow cow3 = new Cow("Marta");
        //System.out.println(cow1.getName());
        //System.out.println(cow2.getName());
        //System.out.println(cow3.getName());
        //System.out.println("Number of cows on farm: " + Cow.getCowCount());


        // Uebung 4, Aufgabe 1a
        Farmer farmer = new Farmer();
        System.out.println(cow1.getName() +
                " is hungry: " + cow1.isHungry());
        farmer.feedCow(cow1);
        System.out.println(cow1.getName() +
                " is hungry: " + cow1.isHungry());
    }
}

