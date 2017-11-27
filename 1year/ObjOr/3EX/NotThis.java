import java.util.Arrays;

//arrayviewer

class ClassMethods {
    
    public static void main( String[] args ) {
        String[] argsbb = new String[args.length];
        argsbb = args;
        int[] int_args = new int[args.length];
        int_args = argChecker( argsbb );
System.out.println( args.length);    
    }
    
    //will check that the command line arguments given are both integers and greater than 2
    public static int[] argChecker( String[] args ) {
System.out.println( "b" );
        int[] int_array = new int[args.length];

        if (args.length > 0) {
            for( int i=0; i>args.length; i++ ) {
System.out.println( "a");
                try {
                    int_array[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.err.println("Argument" + args[i] + " must be an integer.");
                    System.exit(0);
                }   
            }   
        } else if ( args.length > 3 ) {
            System.out.println( "ERROR NOT ENOUGH ARGUMENTS" );
            System.exit(0);
        }
        return int_array; 
    }
}
