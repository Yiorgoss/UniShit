class Q6 {
    public static void main( String[] a ) {
        DrinksMachineB mOne = new DrinksMachineB( 80, 10, 10 );
        DrinksMachineB mTwo = new DrinksMachineB( 100, 20, 20 );   
        
        System.out.println( hasMore( mOne, mTwo ));
        System.out.println( mOne );
    }
    
    public static DrinksMachineB hasMore( DrinksMachineB A, DrinksMachineB B ) {
        int moneyA = A.collectCash();
        int moneyB = B.collectCash();
    
        if( moneyA > moneyB ) {
            return A;
        } else { 
            return B;
        }
    }
}
