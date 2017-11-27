public class TestAccelerate {

    public static void main( String[] args ) {
        Vehicle[] automobiles = new Vehicle[4];
        
        automobiles[0] = new SportsCar( 1500, 200, 0.5, 220 );
        automobiles[1] = new SportsCar( 1000, 100, 0.5, 170 );
        automobiles[2] = new SportsCar( 1100.2, 135, 0.5, 173 );

        automobiles[3] = new Van( 3500, 100, 0.9, 160.4 );
        for( int i=0; i<4; i++ ) {
            if( automobiles[i] instanceof Van ) {
                System.out.println( "Acceleration for Van = "+ automobiles[i].acceleration() );
            } else if( automobiles[i] instanceof SportsCar ) {    
                System.out.println( "Acceleration for sportscar "+ (i+1) +" = "+ automobiles[i].acceleration() );
            } else {
                System.out.println( "ERROR" );
            }
        }
    }
}
