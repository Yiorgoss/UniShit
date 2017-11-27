public class SportsCar extends Vehicle {
    protected static double topspeed;
    protected static double carryweight;
    
    SportsCar( double weight, double horsepower, double aerodynamics, double topspeed, double carryweight ) {
        super( weight, horsepower, aerodynamics );
        this.topspeed = topspeed;
        this.carryweight = carryweight;
    }
    public double getTopSpeed( ) { return this.topspeed; }
    public static double consumption() {
        return( ( 1000+( ( weight/5) ) )*( topspeed/100 )*( aerodynamics * horsepower )/10000 ); 
    }
}
