package uebung7_1a;

import java.util.ArrayList;
import java.util.List;

public class RunCollections {

    public static void main(String[] args) {


        Person p1 = new Person("Charles", 20);
        Person p2 = new Person("Debbie", 41);
        Person p3 = new Person("Padma", 66);

        System.out.println("+++++++++++ Problem 1a ++++++++++++");

        List<Person> people = new ArrayList<>() ;

        people.add(p1);
        people.add(p2);
        people.add(0,p3);


        for (Person person : people) {
            System.out.println(person.toString());
            person.celebrateBirthday();
            System.out.println(person.toString());
        }

        System.out.println("\n");
        people.remove(1) ; // OR
        // people.remove(p2);

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }


}
