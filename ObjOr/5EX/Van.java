public class Van extends Vehicle {
    protected double carryweight;
    public static void main( String[] args ) {

    }
    Van( double weight, double horsepower, double aerodynamics, double carryweight ) {
        
        super( weight, horsepower, aerodynamics );
        this.carryweight = carryweight;
    }
    public double getCarryWeight() { return this.carryweight; }
    public double acceleration() { 
        return ( (100/getHorsePower() )*(getAerodynamics()/2)*( (getWeight() + getCarryWeight() )/100) );
    }

}
