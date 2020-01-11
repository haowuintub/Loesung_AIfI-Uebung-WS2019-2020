package uebung4_1b;

public class Calf extends Cow {
    Cow mother;

    public Calf(String name, Cow cow) {
        super(name);
        mother = cow;
    }
}
