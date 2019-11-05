package uebung4;

class Calf extends Cow {
    private Cow mother ;

    Calf(String name, Cow mother) {
        super(name);
        this.mother = mother ;
    }

    @Override
    String getName() {
        return "calf's name: " + super.getName() + ", mother's name: " + mother.getName();
    }
}
