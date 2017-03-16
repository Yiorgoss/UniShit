import java.io.*;
import java.util.*;

public class Population {
    public static void main( String[] args ) {
        int param = Integer.parseInt( args[0] );
        int c = greaterThan( inputFile( "textfile.txt" ), param );
        
        System.out.println( c );
    }
    public static ArrayList<Integer> inputFile( String fname ) {
        ArrayList<Integer> lines = new ArrayList<Integer>();         
        try {
            BufferedReader input = new BufferedReader( new FileReader( fname ));    
            String c = "";
            while((c = input.readLine()) != null ) {
                String[] tarray = c.split( " " );
                lines.add( Integer.parseInt( tarray[1] ));
            }
        } catch( Exception e ) {

        }
        return lines;
    }
    
    public static int greaterThan( ArrayList<Integer> input, int n ) {
        int j =0;

        for( int i=0; i<input.size(); i++ ) {
            if( input.get(i) >= n ) {
                j++;
            }                          
        }   
        return j;
    }
}
