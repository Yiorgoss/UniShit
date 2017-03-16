import java.io.*;
import java.util.*;

public class Population {
    public static void main( String[] args ) {
        ArrayList<String> als = new ArrayList<String>();
        ArrayList<Integer> ali = new ArrayList<Integer>();
        try {
            als = inputFile( "textfile" );  
            
            System.out.println( als );
        } catch( IOException e ) { 
            System.out.println( " REACHED END OF FILE" );       
        }
    }
    public static <E> ArrayList<Integer> parseInt( ArrayList<E> inputarray ) {
        
        ArrayList<Integer> dfs = new ArrayList<Integer>();
        dfs = inputarray;
        return dfs;
    }
    public static ArrayList<String> inputFile( String arg ) throws IOException {
            ArrayList<String> input = new ArrayList<String>();
            try {
            Scanner sc = new Scanner( new File( arg +".txt" )).useDelimiter( ";" );

            while ( sc.hasNext() ) { 
                input.add( sc.nextLine() );     
//                System.out.println( input );            
            }
        } catch( FileNotFoundException e ) {
            System.out.println( "File not found" );
        }
        return input;
    }
}
