public class SportsCar extends Vehicle {
    protected double topspeed;
    
    public static void main( String[] args ) {

    }
    SportsCar( double weight, double horsepower, double aerodynamics, double topspeed ) {
        super( weight, horsepower, aerodynamics );
        this.topspeed = topspeed;
    }
    public double getTopSpeed( ) { return this.topspeed; }

}
