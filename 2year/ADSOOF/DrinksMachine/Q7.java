class Q7 {
 
    public static void main( String[] a ) {
        DrinksMachineB mach1 = new DrinksMachineB( 10 );
        DrinksMachineB mach2 = new DrinksMachineB( 30 );
        
        System.out.println( mach1.getPrice() );
        System.out.println( mach2.getPrice() );            

        raisePrice( mach1, mach2, 40 );   

        System.out.println( "\nAfter Price Raise\n" );
        System.out.println( mach1.getPrice() );
        System.out.println( mach2.getPrice() );
    }
    
    public static void raisePrice( DrinksMachineB A, DrinksMachineB B, int p ) {
        int aPrice = A.getPrice();
        int bPrice = B.getPrice();
        
        if( aPrice > bPrice ) {
            if( aPrice > bPrice + p ) {
                B.setPrice( bPrice + p );
            } else { 
                B.setPrice( aPrice );
            }
        } else {
            if( bPrice > aPrice + p ) {
                A.setPrice( aPrice + p );
            } else {
                A.setPrice( bPrice );
            }
        }    
    }    
}
