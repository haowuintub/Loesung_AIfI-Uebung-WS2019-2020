package uebung7;

class Person {

    private String name ;
    private int age ;
    private boolean hungry;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungry = true ;
    }

    public String getName() {
        return name;
    }

    boolean getHungry() {
        return hungry;
    }
    void setHungry(boolean hungry) {
        this.hungry = hungry ;
    }

    void celebrateBirthday() {
        this.age ++ ;
        System.out.println(this.name + " is now " + this.age +  " years old");
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }

}
