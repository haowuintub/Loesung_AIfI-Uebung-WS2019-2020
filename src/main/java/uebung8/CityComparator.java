// Sorted: Country Name --> City Name
// Sorted: Country Name --> Population
package uebung8;

import java.util.Comparator;

public class CityComparator implements Comparator<City> {


    @Override
    public int compare(City o1, City o2) {
        int countryValue = o1.getCountry().compareTo(o2.getCountry());

        if (countryValue != 0) {
            return countryValue ;
        }

//        return o1.getName().compareTo(o2.getName());

        if (o1.getPopulation() > o2.getPopulation()) {
            return 1 ;
        } else if (o1.getPopulation() == o2.getPopulation()) {
            return 0 ;
        } else {
            return -1 ;
        }
    }
}
