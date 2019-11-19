package uebung3;

class Cow {

    private String name ;
    private static int cowCount = 0 ;

    Cow() {
        this.setName("NO NAME PROVIDED");
        cowCount ++ ;
    }

    Cow(String name ) {
        this.setName(name);
        cowCount ++ ;
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    static int getCowCount(){
        return cowCount;
    }
}
