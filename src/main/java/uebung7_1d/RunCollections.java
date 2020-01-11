package uebung7_1d;

import java.util.ArrayList;
import java.util.List;

public class RunCollections {

    public static void main(String[] args) {

        Person p1 = new Person("Charles", 20);
        Person p2 = new Person("Debbie", 41);
        Person p3 = new Person("Padma", 66);

        List<Person> people = new ArrayList<>() ;

        people.add(p1);
        people.add(p2);
        people.add(p3);

        Person p4 = new Person("Lola", 98);
        people.add(2, p4);


        System.out.println("\n+++++++++++ Problem 1d ++++++++++++");

        System.out.println(people.remove(p4)); // p4 is not contained in this list, therefore returns false


        System.out.println("list contains p1? : " + people.contains(p1));
//
        if (people.contains(p1)) {
            System.out.println("p1 was removed? : " +people.remove(p1));
        }

        int index = people.indexOf(p2);
        System.out.println("Index of p2: " + index);
        people.remove(index);
        //        int index2 = people.indexOf(p2); // Index is no longer contained in list, produces ArrayIndexOutOfBoundsExceptions
//        people.remove(index2);
        System.out.println(people.get(0));

        people.remove(index);

    }

    }
