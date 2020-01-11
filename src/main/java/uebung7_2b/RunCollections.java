package uebung7_2b;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RunCollections {

    public static void main(String[] args) {

        Person p1 = new Person("Charles", 20);
        Person p2 = new Person("Debbie", 41);
        Person p3 = new Person("Padma", 66);


        Map<String, Person> peopleMap = new LinkedHashMap<>();
        peopleMap.put("Charles", p1) ;
        peopleMap.put("Debbie", p2 ) ;
        peopleMap.put("Padma" , p3 ) ;


        System.out.println("\n+++++++++++ Problem 2a ++++++++++++");

        System.out.println("\bNames : ");
        for (String str : peopleMap.keySet()) {
            System.out.println(str);
        }

/*        System.out.println("\nValues : ");
        for (Person person : peopleMap.values()) {
            System.out.println(person.toString());
        }*/

/*        System.out.println("\nValues : ");
        for (Person person : peopleMap.values()) {
            String a = person.getName() ;
            System.out.println(peopleMap.get(a).toString());
        }*/

        System.out.println("\nEntry-Set");
        for (Map.Entry<String, Person> entry : peopleMap.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }

        System.out.println("\nHungry？: ");
        for (Person person : peopleMap.values()) {
            System.out.println(person.getName() + ", hungy?: " + person.getHungry());
        }


      /*  System.out.println(peopleMap.containsKey("Charles"));
        peopleMap.remove("Charles");
        System.out.println("contain Charles?: " + peopleMap.containsKey("Charles"));*/

        System.out.println(peopleMap.containsValue(p1));
        peopleMap.remove("Charles", p1);
        System.out.println("contain Charles?: " + peopleMap.containsValue(p1));

        peopleMap.get("Grantelbart").getName();

    }

    }
