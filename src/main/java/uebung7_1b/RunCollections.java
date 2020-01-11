package uebung7_1b;

import java.util.ArrayList;
import java.util.List;

public class RunCollections {

    public static void main(String[] args) {


        Person p1 = new Person("Charles", 20);
        Person p2 = new Person("Debbie", 41);
        Person p3 = new Person("Padma", 66);

        System.out.println("+++++++++++ Problem 1b ++++++++++++");

        List<Person> people = new ArrayList<>() ;

        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("list size: " + people.size());

        Person p4 = new Person("Lola", 98);
        people.add(2, p4);

        System.out.println(" \nlist after addition:");

        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("list size: " + people.size());

        }

    }
