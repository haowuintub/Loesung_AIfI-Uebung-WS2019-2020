package uebung7_2a;

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

//        System.out.println("map size: " + peopleMap.size());

        System.out.println("\nIs Charles hungry?: " + peopleMap.get("Charles").getHungry());
        peopleMap.get("Charles").setHungry(false);
        System.out.println("Is Charles hungry?: " + peopleMap.get("Charles").getHungry());

    }

    }
