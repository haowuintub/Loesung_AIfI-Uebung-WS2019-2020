package uebung7_1d;

class Person {

    private String name ;
    private int age ;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void celebrateBirthday() {
        this.age ++ ;
        System.out.println(this.name + " is now " + this.age +  " years old");
    }


    public String toString() {
        return this.name + ", age: " + this.age;
    }

}
