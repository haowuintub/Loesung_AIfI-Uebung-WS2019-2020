package uebung4;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() { return hungry ; }

    public static int getCowCount(){
        return cowCount;
    }


    // Methods
    public void toggleHunger() {
        this.hungry = ! this.hungry;
    }

    public Calf giveBirth(String calfName) {

        return new Calf(calfName, this);

    }
}
