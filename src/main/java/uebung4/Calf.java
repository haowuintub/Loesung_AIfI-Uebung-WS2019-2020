package uebung4;

public class Calf extends Cow {
    private Cow mother ;

    public Calf(String name, Cow mother) {
        super(name);
        this.mother = mother ;
    }

    @Override
    public String getName() {
        return "calf's name: " + super.getName() + ", mother's name: " + mother.getName();
    }


}
