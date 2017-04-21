import java.util.*;
import java.io.*;

public class Population2 {
    public static void main( String[] args ) {
        ArrayList<City> cities = inputFile( "textfile.txt" );
        int count = 0;
        try {
            for( City c : cities ) {
                if( c.getPopulation() >= Integer.parseInt( args[0] )) {
                    count++;
                }
            }
            System.out.println( count );
        } catch( NumberFormatException nfe ) {
            System.out.println( "input must be a number" );
        }
    }
    public static ArrayList<City> inputFile( String fname ) {
        ArrayList<City> city = new ArrayList<City>();     
        try {
            BufferedReader input = new BufferedReader( new FileReader( fname ));    
            String line = "";
            while((line = input.readLine()) != null ) {
                String[] tarray = line.split( " " );
                city.add( new City( tarray[0], Integer.parseInt(tarray[1]), tarray[2] ));
            }
        } catch( Exception e ) {

        }
        return city;
    }
}