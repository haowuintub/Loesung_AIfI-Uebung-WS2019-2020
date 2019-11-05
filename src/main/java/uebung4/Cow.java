package uebung4;

public class Cow {

    private static int cowCount = 0 ;
    private String name ;

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

    public static int getCowCount(){
        return cowCount;
    }
}
