import java.util.Arrays;

class ClassMethods {
    public static void main( String[] args ) {
        
        double[] double_args = new double[args.length];
        
        if( args.length != 3 ) { 
            System.out.println("ERROR"); 
            System.exit(0);
        }       

        for( int i = 0; i < args.length; i++ ) {
            try {
                double_args[i] = Double.parseDouble( args[i] );
            } catch( NumberFormatException e ) {
                
            } 
        }
        middleNum( double_args );
    }
    public static void middleNum( double[] args ) {
        Arrays.sort( args );
        System.out.println( args[1] );
    }
}
