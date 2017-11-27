public class Vehicle {
    private double weight;
    private double horsepower;
    private double aerodynamics;

    public static void main( String[] args ) {
        
    }
    Vehicle( double weight, double horsepower, double aerodynamics ) {
        this.weight = weight;
        this.horsepower = horsepower;
        this.aerodynamics = aerodynamics;
    }
    
    public double getWeight( ) { return this.weight; }
    public double getHorsePower( ) { return this.horsepower; }
    public double getAerodynamics( ) { return this.aerodynamics; }
    public double acceleration() {
        return( (100/getHorsePower() )*(getAerodynamics() )*(getWeight()/100) );
    }
}
 
