package uebung8_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RunCities {

    public static void main(String[] args) {
        City c1 = new City("Hamburg", "Germany", 1800000);
        City c2 = new City("Birmingham", "UK", 1100000);
        City c3 = new City("Milan", "Italy", 1300000);
        City c4 = new City("Rome", "Italy", 2800000);
        City c5 = new City("Paris", "France", 2100000);
        City c6 = new City("Berlin", "Germany", 3700000);
        City c7 = new City("Cologne", "Germany", 1000000);
        City c8 = new City("Munich", "Germany", 1400000);
        City c9 = new City("London", "UK", 8900000);
        City c10 = new City("Barcelona", "Spain", 1600000);
        City c11 = new City("Madrid", "Spain", 3200000);

        List<City> cityList = new ArrayList<>();
        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);
        cityList.add(c5);
        cityList.add(c6);
        cityList.add(c7);
        cityList.add(c8);
        cityList.add(c9);
        cityList.add(c10);
        cityList.add(c11);

        System.out.println("\nUnsorted");

        for (City city : cityList) {

            System.out.println(city);

        }


        System.out.println("\n Shuffled");
        Collections.shuffle(cityList);

        for (City city : cityList) {
            System.out.println(city);
        }


        System.out.println("\nSorted");
        Collections.sort(cityList);


        for (City city : cityList) {
            System.out.println(city);
        }

    }
}
