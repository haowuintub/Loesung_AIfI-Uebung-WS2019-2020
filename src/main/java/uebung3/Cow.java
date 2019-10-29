package uebung3;

public class Cow {

    private String name ;
    private static int cowCount = 0 ;

    public Cow() {
        this.setName("NO NAME PROVIDED");
        cowCount ++ ;
    }

    public Cow(String name ) {
        this.setName(name);
        cowCount ++ ;
    }


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
