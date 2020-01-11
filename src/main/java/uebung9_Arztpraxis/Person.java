package uebung9_Arztpraxis;

class Person implements Comparable<Person> {

    String name;
    int birthYear;

    Person(String name, int birthYear){
        this.name = name ;
        this.birthYear = birthYear ;
    }


    public void setName(){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }




//    @Override
    public String toString() {
        return name + ", " + birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person oPerson = (Person) o ;
            return this.getBirthYear() == oPerson.getBirthYear() && this.getName().equals(oPerson.getName());
        }
        return false ;
    }



    @Override
    public int compareTo(Person o) {

        if (this.birthYear > o.birthYear) {
            return 1 ;
        } else if (this.birthYear == o.birthYear) {
            return 0 ;
        } else {
            return -1 ;
        }

    }

    //    compareTo() for name
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }

}
