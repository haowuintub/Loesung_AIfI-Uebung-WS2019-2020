package uebung3_1d;

class Farm {
    public static void main( String[] args){
        Cow cow1 = new Cow("Berta");
        Cow cow2 = new Cow("Hilde");
        Cow cow3 = new Cow("Marta");

        System.out.println( cow1.getName() );
        System.out.println( cow2.getName() );
        System.out.println( cow3.getName() );
    }
}