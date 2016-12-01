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
        
        unPausePet( "name" );
       // String currentPet = namePet();
       // createPet( newStats, currentPet );

        //gameStart(hard, currentPet );    

        for( DinoPet pet : pausedPets ) {
            int[] var = new int[3];
            var = pet.getDinoStats();
            String nome = pet.name;
            String what = pet.getName();
        }

       // int[] leadersorted = new int[n];
       // leadersorted = leaderSort( leadersorted );
       
      //  String whatever = Arrays.toString( leadersorted );
      //  System.out.println( whatever );


 
    
    }        
    public static void unPausePet( String param ) 
    {
        String name = param;
        for( DinoPet pet : pausedPets )
        {
            if( pet.name.equals( name ) ) 
            {
                int[] dino_stats = new int[2];
                dino_stats = pet.dinoStats;
                createGame( dino_stats, pet.name );
            }
        }
    } 
    public static void createGame( int[] array, String name )
    {
        Scanner sc = new Scanner( System.in );
        int[] dinostats = new int[3];
        dinostats = array;
        String instruction = "";
     
        int age = dinostats[0];
        int hunger = dinostats[1];
        int thirst = dinostats[2];
        
        boolean istrue = true;
        while( istrue = true ) {
            
            System.out.println( "What would you like to do?" );
            instruction = sc.nextLine();
            int random = ( int )( Math.random() * 5 );       

            hunger--;
            thirst--;;
            age++;

            if( instruction.equals( "END" ) ) { istrue = false; } 
            

            if( instruction.equals( "EAT" ) ) {
                hunger += random; 
                System.out.println( "Hunger:  "+ hunger +"[+"+ random +"]" );
                System.out.println( "Age:  "+ age );
            //    continue;
            } else if( instruction.equals( "DRINK" ) ) {
                thirst += random;
                System.out.println( "Thirst:  "+ thirst +"[+"+ random +"]" );
                System.out.println( "Age:  "+ age );
            //      continue;
            } else if( instruction.equals( "SAVE" ) ) {
                int[] dino_stats = new int[] { age, hunger, thirst };
         //       savePet( name, dino_stats );
                 
         //       break;
            } else {
                System.out.println( "Sorry command not recognised. Available commands are EAT, DRINK, END" );
                continue; 
            }
             
        }
        //savePet();
        //checkHighScore();
    }
    public static void savePet( String name, int[] dinostats )
    {
        int[] dino_stats = new int[3];
        dinostats = dino_stats;
    
        for( DinoPet pet : pausedPets )
        {
            if( pet.name.equals( name ) ) 
            {
                pet.dinoStats = dino_stats;
            }
        }
        /*try {
            outFile( "PausedPets.txt" );
            System.out.println( "SAVED" );
        } catch( IOException ioe ) {
        }*/
    }   
    public static void createPet( int[] array, String name ) 
    {
        int[] dinoStats = new int[array.length];
        dinoStats = array; 
        pausedPets.add( new DinoPet( dinoStats, name ) );
    }
    
    public static void outFile( String textfile ) throws java.io.IOException 
    {
        File outFile = new File ( textfile );
        FileWriter fWriter = new FileWriter ( outFile, true );
        PrintWriter pWriter = new PrintWriter ( fWriter );
        for( DinoPet pet : pausedPets )
        {
            int[] dino_stats = new int[3];
            dino_stats = pet.dinoStats;
            String name = pet.name;

            pWriter.println( dino_stats[0] );
            pWriter.println( dino_stats[1] );
            pWriter.println( dino_stats[2] ); 
            pWriter.println( name );    
        }
        pWriter.close();
    }
    public static void inFile( String textfile ) throws java.io.IOException 
    {
        File inFile = new File ( textfile );
        
        int[] intarray = new int[3];
        int counter = 0;
        Scanner sc = new Scanner ( inFile );
        

        while ( sc.hasNextLine( ) ) 
        {
            String strInp = sc.nextLine( );
            try
            {
                int intInp = Integer.parseInt( strInp );
                intarray[counter] = intInp;
                //System.out.println(intInp); 
             }
            catch( NumberFormatException e ) 
            {
                int[] test = intarray.clone();
                createPet( test, strInp ); 
                continue;
            } 
            counter = ( counter + 1) % 3;
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

    String name;
    int[] dinoStats = new int[3]; // dino stats are age hunger thirst in that order
    boolean ishungry = false;
    boolean isthirsty = false;

    public DinoPet( int[] array, String param ) 
    {
        name = param;
        dinoStats = array;
    }   
    
    public int[] getDinoStats( ) 
    {
        return this.dinoStats;
    }
    
    public String getName( ) 
    {
        return this.name;
    }
}
