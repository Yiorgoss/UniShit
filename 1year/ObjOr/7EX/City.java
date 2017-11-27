public class City {
    private String city;
    private int population;
    private String country;
    
    public City( String city, int population, String country ) {
        this.city = city;
        this.population = population;
        this.country = country;
    }
    public int getPopulation( ) { return this.population; }
}