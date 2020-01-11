package uebung4_1c;

public class Calf extends Cow {
    Cow mother;

    public Calf(String name, Cow cow) {
        super(name);
        mother = cow;
    }

        @Override
        String getName() {
            return "calf's name: " + super.name + ", mother's name: " + mother.getName();
    }
}
