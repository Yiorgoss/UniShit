import java.io.*;
import java.net.*;
//HttpURLConnection;

public class APICall {
    public static void main(String[] args) {

        String message = args[0];
        
        //MAKING API CALL TO YAHOO FINANCE API
        String url = "http://finance.yahoo.com/d/quotes.csv?s=" + message + "&f=nabm7";
        try{
            input(url);
        } catch( Exception e ) {
        }
    }
    public static void input( String url ) throws Exception {
        URL oracle = new URL( url );
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        try {
            PrintWriter writer = new PrintWriter( "Stock_Search.txt", "UTF-8" );
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                
                System.out.println( inputLine );
                writer.println( inputLine );
            }
            writer.close();
            in.close();
        } catch( IOException e ) {
            System.out.println( "Incorrect url format" );
        }
    }
}
