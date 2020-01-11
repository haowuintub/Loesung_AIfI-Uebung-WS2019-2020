package uebung7_2a;

class Person {

    private String name ;
    private int age ;
    private boolean hungry ;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungry = true ;
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

    void setHungry(boolean hungry){
         this.hungry = hungry ;
    }

    boolean getHungry(){
        return hungry ;
    }

}
