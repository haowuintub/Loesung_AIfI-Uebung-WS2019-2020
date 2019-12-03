package uebung8;

public class City {

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
        return "" ; // Fill this out!
    }


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
