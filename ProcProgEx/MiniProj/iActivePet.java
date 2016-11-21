import java.util.*;
import java.io.*;

public class iActivePet {
    
    public static ArrayList<DinoPet> pausedPets = new ArrayList<DinoPet>(); 
    
    public static void main( String[] p ) {
       
        int[] newStats = new int[]{ 0, 10, 10 }; 
        try {   
            inFile( "PausedPets.txt" );
        } catch ( IOException ioe ) {  
            // read more on ioexception
        }

       // String currentPet = namePet();
       // createPet( newStats, currentPet );

        //gameStart(hard, currentPet );    

        for( DinoPet pet : pausedPets ) {
            for( int i=0; i<2; i++) {
                int retval = pet.dinoStats[i]; 
                System.out.println(retval);
            }
        }


       // int[] leadersorted = new int[n];
       // leadersorted = leaderSort( leadersorted );
       
      //  String whatever = Arrays.toString( leadersorted );
      //  System.out.println( whatever );


 
    
    }        
            
    public static void gameStart( int[] array, String petName )
    {
            
        int age = array[0];
        int hunger = array[1];
        int thirst = array[2]; 
   
        Scanner sc = new Scanner( System.in );
        int counter = 0;
        String instruction = "";

        

        while ( true ) {
            
            System.out.println( "What would you like to do?" );
            instruction = sc.nextLine();
            
            if ( instruction.equals( "END" ) ) { break; } 
            

            if( instruction.equals( "EAT" ) ) {
                hunger += 2;
            } else if( instruction.equals( "DRINK" ) ) {
                thirst += 2;
            } else {
                System.out.println( "Sorry command not recognised. Available commands are EAT, DRINK, END" ); 
            }
            
            hunger = energyDrain( hunger, counter );
            thirst = energyDrain( thirst, counter );                     
            counter++;
        }
        //importSavedPet();
        //savePet();
        //checkHighScore();
        
    }
 
    public static int energyDrain( int num, int counter ) {
        int percentenergy = num / counter;
        return percentenergy;
    }

    public static void createPet( int[] array, String name ) 
    {
        int[] dinoStats = new int[0];
        dinoStats = array; 
        pausedPets.add( new DinoPet( dinoStats, name ) );
    }
    
    public static void outFile( String textfile ) throws java.io.IOException 
    {
        File outFile = new File ( textfile );
        FileWriter fWriter = new FileWriter ( outFile, true );
        PrintWriter pWriter = new PrintWriter ( fWriter );
        pWriter.println( "whatever2" );
        pWriter.close();
    }
    public static void inFile( String textfile ) throws java.io.IOException 
    {
        File inFile = new File ( textfile );
        
        Scanner sc = new Scanner ( inFile );
        while ( sc.hasNextLine( ) ) 
        {
            int[] intarray = new int[3];
            int counter = 0;
            String strInp = sc.nextLine( );
            try
            {
                int intInp = Integer.parseInt( strInp );
                intarray[counter] = intInp;
                for(int i=0;i<2;i++) {System.out.println( intarray[i] );}    
            }
            catch( NumberFormatException e ) 
            {
            //    for(int i=0;i<2;i++) {System.out.println( intarray[i] );}    
                createPet( intarray, strInp );         
                continue;
            } 
            counter = (counter + 1) % 3;
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

    public static String namePet() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to name your pet");
        name = sc.nextLine();
        return name;
    }
}

class DinoPet {

    public String name;
    public int[] dinoStats = new int[3];
    public boolean ishungry = false;
    public boolean isthirsty = false;

    public DinoPet( int[] array, String name ) 
    {
        name = name;
        dinoStats = array;
    }   


}
