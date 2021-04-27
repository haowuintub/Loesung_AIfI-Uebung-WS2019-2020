package uebung8_3_Maps;

import java.util.*;

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


        Map<String, City> cityMap = new HashMap<>();
        cityMap.put("Hamburg", c1);
        cityMap.put("Birmingham", c2);
        cityMap.put("Milan", c3);
        cityMap.put("Rome", c4);
        cityMap.put("Paris", c5);
        cityMap.put("Berlin", c6);
        cityMap.put("Cologne", c7);
        cityMap.put("Munich", c8);
        cityMap.put("London", c9);
        cityMap.put("Barcelona", c10);
        cityMap.put("Madrid", c11);

        System.out.println("\nUnsorted");
        for (Map.Entry<String, City> entry : cityMap.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }


/*
        System.out.println("\nRemove German Cities");

        // 不能移除德国城市
          for (Map.Entry<String, City> entry : cityMap.entrySet()) {
            if (entry.getValue().getCountry().equals("Germany")) {
                cityMap.remove(entry);
            }
        }

*/
/*        for (String str : cityMap.keySet()) {
            if (str.equals("Germany")) {
                cityMap.remove(str);
            }
        }*//*


*/
/*        for (City city : cityMap.values()) {
            if (city.getCountry().equals("Germany")) {
                cityMap.remove(city);
            }
        }*//*


        for (Map.Entry<String, City> entry : cityMap.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }
*/


        System.out.println("\nRemove German Cities");
/*        // 不能移除德国城市，可能只能移除Key
        for(Iterator<String> it = cityMap.keySet().iterator(); it.hasNext();) {
            String str = it.next();
            if (str.equals("Germany")) {
                it.remove();
            }
        }*/

          // 可以移除德国城市
        for(Iterator<City> it = cityMap.values().iterator(); it.hasNext();) {
            City city = it.next();
            if (city.getCountry().equals("Germany")) {
                it.remove();
            }
        }

/*        for(Iterator<Map.Entry<String, City>> it = cityMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry mapEntry = it.next();
//              if (mapEntry.getValue().getCountry().equals("Germany")) {
            if (mapEntry.getKey().equals("Germany")) {
                it.remove();
            }
        }*/

        for (Map.Entry<String, City> entry : cityMap.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }

    }
}
