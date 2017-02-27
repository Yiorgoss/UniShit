public class Van extends Vehicle {
    protected static double carryweight;
    protected static double topspeed;
    
    Van( double weight, double horsepower, double aerodynamics, double carryweight, double topspeed ) {
        
        super( weight, horsepower, aerodynamics );
        this.carryweight = carryweight;
        this.topspeed = topspeed;
    }
    public double getCarryWeight() { return this.carryweight; }
    public static double acceleration() { 
        return ( (100/horsepower) )*(getAerodynamics()/2)*( (getWeight() + carryweight )/100) ;
    }
    public static double consumption() {
                    return( ( 1000+( ( (weight + carryweight)/5) ) )*( topspeed/100 )*( aerodynamics * horsepower )/10000 ); 
    }

}
