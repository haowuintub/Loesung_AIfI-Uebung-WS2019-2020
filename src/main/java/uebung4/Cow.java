package uebung4;

class Cow {

    private static int cowCount = 0 ;
    private String name ;

    // Constructor
    Cow(String name) {
        this.setName(name);
        cowCount ++ ;
    }

    // Getters & Setters
    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    static int getCowCount(){
        return cowCount;
    }
}
