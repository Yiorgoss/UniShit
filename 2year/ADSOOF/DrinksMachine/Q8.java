import java.util.ArrayList;

class Q8 {

    public static void main( String[] a ) {
        DrinksMachineB mach = new DrinksMachineB( 100, 20, 30 );
        System.out.println( cokeCount( mach ));
    }
    public static int cokeCount( DrinksMachineB A ) {
        A.insert( 10000 );
        ArrayList<Can> myCans = new ArrayList<Can>();
        int numCans = 0;

        try {

            while( true ) {
                myCans.add( A.pressCoke() );
            }
        } catch( EmptyMachineException eme ) {
            
            numCans = myCans.size();            
            for( int i=0; i<myCans.size(); i++ ) {
                A.loadFanta( myCans.get(i) );    
            }
  
            return numCans;
        } catch( NotEnoughMoneyException neme ) { return numCans; }
    }
}
