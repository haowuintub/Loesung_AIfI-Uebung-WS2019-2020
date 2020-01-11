package uebung8_2;

public class City implements Comparable<City> {

    private String name ;
    private String country ;
    private int population ;

    City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.country + ", population: " + this.population;
    }

    // compareTo() for population
    public int compareTo(City o) {
        if (this.population > o.population) {
            return 1 ;
        } else if (this.population == o.population) {
            return 0 ;
        } else {
            return -1 ;
        }
    }

//    compareTo() for name
//    public int compareTo(City o) {
//        return this.name.compareTo(o.name);
//    }


    String getName() {
        return name;
    }

    String getCountry() {
        return country;
    }

    int getPopulation() {
        return population;
    }


}
