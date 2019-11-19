package uebung3;

class Farm {
    public static void main(String[] args) {

        Cow cow1 = new Cow("Berta");
        Cow cow2 = new Cow("Hilde");
        Cow cow3 = new Cow() ;

        System.out.println(cow1.getName());
        System.out.println(cow2.getName());
        System.out.println(cow3.getName());

        cow3.setName("Marta");

        System.out.println(cow3.getName());

        System.out.println("Number of cows on farm: " + Cow.getCowCount());
    }
}
