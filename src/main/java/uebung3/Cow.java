package uebung3;

class Cow {
    private String name ;
    static private int cowCounter = 0 ;

    public Cow(String name) {
        this.name = name ;
        cowCounter++ ;
    }

    public String getName() {
        return name ;
    }

    public static int getCowCount() {
        return cowCounter;
    }
}
