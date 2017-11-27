public class Vehicle {
    protected static double weight;
    protected static double horsepower;
    protected static double aerodynamics;

    Vehicle( double weight, double horsepower, double aerodynamics ) {
        this.weight = weight;
        this.horsepower = horsepower;
        this.aerodynamics = aerodynamics;
    }
    
    public static double getWeight( ) { return weight; }
    public static double getHorsePower( ) { return horsepower; }
    public static double getAerodynamics( ) { return aerodynamics; }
    public static double acceleration() {
        return( (100/horsepower )*(aerodynamics )*(weight/100) );
    }
}
 
