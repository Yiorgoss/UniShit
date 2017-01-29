import java.util.*;

class TestConsumption {
    
    public static void main( String[] args ) {
        SportsCar[] sc = new SportsCar[3];
        
        for( int i = 0; i < 3; i++ ){
            sc[i] = new SportsCar();
        }

        sc[0].setHorsePower(200);
        sc[1].setHorsePower(100);
        sc[2].setHorsePower(135);

        sc[0].setWeight(1500);
        sc[1].setWeight(1000);  
        sc[2].setWeight(1100.2);

        sc[0].setTopSpeed(220);
        sc[1].setTopSpeed(170);
        sc[2].setTopSpeed(173);
        
        int i = 1;
        for( SportsCar car : sc ) {
            double fuelconsumption = FuelConsumption(car);
            System.out.println( "SportsCar "+ i +"'s fuel consumption is "+ fuelconsumption );
            i++;
        }
        
    }
    public static double FuelConsumption( SportsCar sc ) {
        return( ( 1000+( sc.getWeight()/5 ) )*( sc.getTopSpeed()/100 )*( sc.getAerodynamics() * sc.getHorsePower() )/10000 ); 
    }
}
