package uebung9;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name ;
    private int birthYear;
    private Doctor treatingDoctor;

    Person(String name, int birthYear)

    {
        this.name = name;
        this.birthYear = birthYear;
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBirthYear() {
        return birthYear;
    }

    void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + ", " + birthYear;
    }


    @Override
    public boolean equals(Object o) {
        Person oPerson = (Person) o ;
        if (this.getBirthYear() == oPerson.getBirthYear() && this.getName().equals(oPerson.getName())) {
            return true ;
        }
        return false ;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getBirthYear() > o.getBirthYear()) {
            return 1;
        } else if (this.getBirthYear() == o.getBirthYear()) {
            return 0;
        } else {
            return -1;
        }
    }

    void setTreatingDoctor(Doctor doctor) {
        this.treatingDoctor = doctor ;
    }
}
