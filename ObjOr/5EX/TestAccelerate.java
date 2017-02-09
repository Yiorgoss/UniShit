public class TestAccelerate {

    public static void main( String[] args ) {
        SportsCar sc1 = new SportsCar( 1500, 200, 0.5, 220 );
        SportsCar sc2 = new SportsCar( 1000, 100, 0.5, 170 );
        SportsCar sc3 = new SportsCar( 1100.2, 135, 0.5, 173 );

        Van van = new Van( 3500, 100, 0.9, 160.4 );
        
        System.out.println( "Acceleration for sportscar 1 = "+ sc1.acceleration() );
        System.out.println( "Acceleration for sportscar 2 = "+ sc2.acceleration() );
        System.out.println( "Acceleration for sportscar 3 = "+ sc3.acceleration() );
        System.out.println( "Acceleration for Van = "+ van.acceleration() );
    }
}
