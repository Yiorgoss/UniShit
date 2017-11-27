public class TestConsumption {
    public static void main( String[] args ) {
        SportsCar[] sc = new SportsCar[3];
        
        sc[0]= new SportsCar( 1500, 200, 0.5, 220 );
        sc[1]= new SportsCar( 1000, 100, 0.5, 170 );
        sc[2]= new SportsCar( 1100.2, 135, 0.5, 173 ); 
        
         System.out.println( "Fuel consumption for sportscar 1 "+ FuelConsumption( sc[0] ) );
        System.out.println( "Fuel consumption for sportscar 2 "+ FuelConsumption( sc[1] ) );
        System.out.println( "Fuel consumption for sportscar 3 "+ FuelConsumption( sc[2] ) );
    }
    public static double FuelConsumption( SportsCar sc ) {
        return( ( 1000+( ( sc.getWeight()/5) ) )*( sc.getTopSpeed()/100 )*( sc.getAerodynamics() * sc.getHorsePower() )/10000 ); 
    }
}
