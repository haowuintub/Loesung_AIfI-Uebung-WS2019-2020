package uebung3_1a;

public class Farm {
    public static void main( String[] args){
        Cow cow1 = new Cow();
        cow1.name = "Berta";
        Cow cow2 = new Cow();
        cow2.name = "Hilde";
        Cow cow3 = new Cow();
        cow3.name = "Marta";
        System.out.println( cow1.name );
        System.out.println( cow2.name );
        System.out.println( cow3.name );
    }
}
