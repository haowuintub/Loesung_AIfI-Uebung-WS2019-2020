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


        Map<String, City> cityList = new HashMap<>();
        cityList.put("Hamburg", c1);
        cityList.put("Birmingham", c2);
        cityList.put("Milan", c3);
        cityList.put("Rome", c4);
        cityList.put("Paris", c5);
        cityList.put("Berlin", c6);
        cityList.put("Cologne", c7);
        cityList.put("Munich", c8);
        cityList.put("London", c9);
        cityList.put("Barcelona", c10);
        cityList.put("Madrid", c11);

        System.out.println("\nUnsorted");
        for (Map.Entry<String, City> entry : cityList.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }


/*
        System.out.println("\nRemove German Cities");

        // 不能移除德国城市
          for (Map.Entry<String, City> entry : cityList.entrySet()) {
            if (entry.getValue().getCountry().equals("Germany")) {
                cityList.remove(entry);
            }
        }

*/
/*        for (String str : cityList.keySet()) {
            if (str.equals("Germany")) {
                cityList.remove(str);
            }
        }*//*


*/
/*        for (City city : cityList.values()) {
            if (city.getCountry().equals("Germany")) {
                cityList.remove(city);
            }
        }*//*


        for (Map.Entry<String, City> entry : cityList.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }
*/


        System.out.println("\nRemove German Cities");
/*        // 不能移除德国城市，可能只能移除Key
        for(Iterator<String> it = cityList.keySet().iterator(); it.hasNext();) {
            String str = it.next();
            if (str.equals("Germany")) {
                it.remove();
            }
        }*/

          // 可以移除德国城市
        for(Iterator<City> it = cityList.values().iterator(); it.hasNext();) {
            City city = it.next();
            if (city.getCountry().equals("Germany")) {
                it.remove();
            }
        }

/*        for(Iterator<Map.Entry<String, City>> it = cityList.entrySet().iterator(); it.hasNext();) {
            Map.Entry mapEntry = it.next();
              if (mapEntry.getValue().getCountry().equals("Germany")) {
//            if (mapEntry.getKey().equals("Germany")) {
                it.remove();
            }
        }*/

        for (Map.Entry<String, City> entry : cityList.entrySet()) {
            System.out.println("K: " + entry.getKey() + ", V: " + entry.getValue());
        }

    }
}
