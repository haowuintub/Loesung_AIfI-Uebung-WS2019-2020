package uebung7_1c;

import java.util.ArrayList;
import java.util.List;

public class RunCollections {

    public static void main(String[] args) {


        Person p1 = new Person("Charles", 20);
        Person p2 = new Person("Debbie", 41);
        Person p3 = new Person("Padma", 66);


//        System.out.println(p1) ;


        System.out.println("+++++++++++ Problem 1c ++++++++++++");

        List<Person> people = new ArrayList<>() ;

        System.out.println(people.isEmpty());

        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println(people.isEmpty());

        people.clear();
        System.out.println("after people.clear(): " + people.isEmpty());

        }

    }
