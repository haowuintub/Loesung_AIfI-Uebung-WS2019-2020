package uebung4_1b;

public class Cow {
    private static int cowCount = 0 ;
    private String name ;
    private boolean hungry = true;

    // Constructor
    public Cow(String name ) {
        this.setName(name);
        cowCount ++ ;
    }

    // Getters & Setters
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    boolean isHungry() { return hungry ; }
    static int getCowCount(){ return cowCount; }

    // Methods
    public void toggleHunger() {
        this.hungry = ! this.hungry;
    }

    Calf giveBirth(String calfName){
        Calf calf5 = new Calf(calfName, this);
        return calf5;
    }
}

