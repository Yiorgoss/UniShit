import java.util.*;
import java.io.*;
import java.lang.*;

public class UserInp {
    
    //Create user from textFile that will be input
    private static User user;
    public static User initUser(String fname) {
        try {
            BufferedReader br = new BufferedReader( new FileReader( fname+".txt" ));
            String line = "";
            while( (line = br.readLine()) != null ) {
                
                String[] array = line.split( "," );
                user = new User( array[0], Integer.parseInt( array[1] ), Double.parseDouble( array[2] ));
                if( array.length > 3 ) {
                    //user.setUpPortfolio( array );
                    
                }
            }
        } catch( Exception e ) {

        }
       
        return user;
    }
    
}