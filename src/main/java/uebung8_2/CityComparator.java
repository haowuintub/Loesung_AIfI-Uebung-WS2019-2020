package uebung8_2;

import java.util.Comparator;

public class CityComparator implements Comparator<City> {

/*    @Override
    public int compare(City o1, City o2) {
        String countryName1 = o1.getCountry();
        String countryName2 = o2.getCountry();
        return countryName1.compareTo(countryName2);
    }*/

    @Override
    public int compare(City o1, City o2) {
        String countryName1 = o1.getCountry();
        String countryName2 = o2.getCountry();

        int population1 = o1.getPopulation();
        int population2 = o2.getPopulation();

        String Name1 = o1.getName();
        String Name2 = o2.getName();


        int a = countryName1.compareTo(countryName2);
        int b = Name1.compareTo(Name2);


        if(a != 0) {
            return a;
        } else {

                if(population1 > population2){
                    return  1 ;
                } else if(population1 == population2){
                    return 0 ;
                } else{
                    return -1 ;
                      }


//                          return b;


                }


    }
}

