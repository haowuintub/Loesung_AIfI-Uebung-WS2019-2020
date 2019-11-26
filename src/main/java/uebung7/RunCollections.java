package uebung7;

import java.util.*;

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

        System.out.println("\n+++++++++++ Problem 1b ++++++++++++");

        people.clear();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("list size: " + people.size());

        Person p4 = new Person("Lola", 98);
        people.add(2, p4);

        System.out.println("list size after addition: " + people.size());

        System.out.println(" \n list after addition:");

        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("\n+++++++++++ Problem 1c ++++++++++++");

        System.out.println(people.isEmpty());

        people.clear();

        System.out.println(people.isEmpty());

//
        System.out.println("\n+++++++++++ Problem 1d ++++++++++++");

        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println("list contains p1? : " + people.contains(p1));
//
        if (people.contains(p1)) {
            people.remove(p1);
        }

        System.out.println(people.remove(p4)); // p4 is not contained in this list, therefore returns false

        int index = people.indexOf(p2);
        people.remove(index);
//        int index2 = people.indexOf(p2); // Index is no longer contained in list, produces ArrayIndexOutOfBoundsExceptions
//        people.remove(index2);

        System.out.println("\n+++++++++++ Problem 2a ++++++++++++");
        Map<String, Person> peopleMap = new LinkedHashMap<>();
        peopleMap.put("Charles", p1) ;
        peopleMap.put("Debbie", p2 ) ;
        peopleMap.put("Padma" , p3 ) ;

        System.out.println("map size: " + peopleMap.size());

        System.out.println("\nIs Charles hungry?: " + peopleMap.get("Charles").getHungry());
        peopleMap.get("Charles").setHungry(false);
        System.out.println("Is Charles hungry?: " + peopleMap.get("Charles").getHungry());

        System.out.println("\n+++++++++++ Problem 2b ++++++++++++");

        System.out.println("\bKeys : ");
        for (String str : peopleMap.keySet()) {
            System.out.println(str);
        }

        System.out.println("\nValues : ");
        for (Person person : peopleMap.values()) {
            System.out.println(person.toString() + ", hungy?: " + person.getHungry());
        }

        System.out.println("\nEntry-Set");
        for (Map.Entry<String, Person> entry : peopleMap.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }
    }
}
