import java.util.*;
import java.io.*;

public class iActivePet {
    
    public static void main( String[] p ) {
        
        ArrayList<DinoPet> pausedPets = new ArrayList<DinoPet>(); 
        pausedPets.add( new DinoPet( "Test1", 0, 10, 10 ) );
        pausedPets.add( new DinoPet( "Test2", 0, 10, 10 ) );
        pausedPets.add( new DinoPet( "Test3", 0, 10, 10 ) );
        
        for( DinoPet pet : pausedPets ) { 
            
        }
       // int[] leadersorted = new int[n];
       // leadersorted = leaderSort( leadersorted );
       
      //  String whatever = Arrays.toString( leadersorted );
      //  System.out.println( whatever );


 
       /* try {   
            outFile();
        } catch (IOException ioe) {  
            // read more on ioexception
        }*/

        
        
             
    public static int energy( int num, int counter ) {
        int percentenergy = num/( counter + 1 );
        return percentenergy;
    }

    public static void createPet( String name ) 
    {
       /* for ( DinoPet param : PausedPets ) 
        { 
            param.hunger = 10;
            param.thirst = 10;
            param.ishungry = false;
            param.isthirsty = false;
        }*/        

    }
    
    public static void outFile( String textfile) throws java.io.IOException 
    {
        File outFile = new File ( textfile );
        FileWriter fWriter = new FileWriter ( outFile, true );
        PrintWriter pWriter = new PrintWriter ( fWriter );
        pWriter.println( "whatever2" );
        pWriter.close();
    }
    public static void inFile(String textfile ) throws java.io.IOException 
    {
        File inFile = new File ( textfile );
        
        Scanner sc = new Scanner ( inFile );
        while ( sc.hasNextLine() ) 
        {
          break;  
        }
    }
    public static int[] leaderSort( int[] param ) {

        int n = param.length;
        int[] array = new int[ n ];
        array = param;

        for( int i=( n-1 ); i>0; i-- ) {
            for( int j=0; j<( n-1 ); j++ ) {
                if( array[j] < array[i] ) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    String array2 = Arrays.toString ( array );
                }
            }
        }
        return array;
    }

    public static void namePet() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to name your pet");
        name = sc.nextLine();
        sc.close();
    }
}
