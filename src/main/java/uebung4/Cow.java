package uebung4;

class Cow {

    private static int cowCount = 0 ;
    private String name ;
    private boolean hungry = true;

    // Constructor
    Cow(String name ) {
        this.setName(name);
        cowCount ++ ;
    }

    // Getters & Setters
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    boolean isHungry() { return hungry ; }

    static int getCowCount(){
        return cowCount;
    }


    // Methods
    void toggleHunger() {
        this.hungry = ! this.hungry;
    }

    Calf giveBirth(String calfName) {

        return new Calf(calfName, this);

    }
}
