import java.util.*;
//import org.apache.commons.lang3.ArrayUtils;
import java.io.*;
import java.lang.*;

public class StockParse {

    public static ArrayList<Stock> inputFile( String fname ) {
        ArrayList<Stock> stocks = new ArrayList<Stock>();
        
        //create arraylist of stocks
        // declining stock if bid below fifty day move average
        try {  
            BufferedReader input = new BufferedReader( new FileReader( fname+".txt"));
            String line = "";
            while(( line = input.readLine()) != null) {
                String[] strstock = line.split( "," );
                double[] doubstock = new double[strstock.length-1];
                for( int i=1; i<strstock.length; i++ ) {
                    doubstock[i-1] = Double.parseDouble( strstock[i] );
                }
                if( doubstock[2] <= 0 ) {
                    stocks.add( new DecliningStock( strstock[0], doubstock[0], doubstock[1], doubstock[2] ));
                } else {
                    stocks.add( new RisingStock( strstock[0], doubstock[0], doubstock[1], doubstock[2] ));
                }
            }
        } catch( IOException ioe ) { 
        } 
        return stocks;
    }
}
