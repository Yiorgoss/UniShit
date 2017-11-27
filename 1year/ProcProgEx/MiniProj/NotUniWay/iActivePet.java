import java.util.*;
import java.io.*;

public class iActivePet {
    
    public static void main( String[] p ) {
        Scanner sc = new Scanner( System.in );

        int[] new_stats = new int[]{ 0, 10, 10 }; 
       
         try {   
            inFile( "PausedPets.txt" );
        } catch ( IOException ioe ) {  
        }
        // file input
        
        System.out.println( "What pet would you like to play on" );        
        String current_pet = sc.nextLine();
        if( current_pet.equals( "new pet" ) )
        {
            String name;
            name = namePet();

            createGame( new_stats, name );
        } else {    
            unPausePet( current_pet );
        }
        //create new pet/ continue with pre-exsisting pet
  /*      
        int[] leadersorted = new int[3];
        leadersorted = leaderSort( leadersorted );
       
        String whatever = Arrays.toString( leadersorted );
        System.out.println( whatever );
*/
     //   sortInput();
        leaderPrint();
    }        
    public static void unPausePet( String param ) 
    {
        String name = param;
        int[] dino_stats = new int[3];
        
        for( DinoPet pet : pausedPets )
        {
            if( pet.name.equals( name ) ) 
            {
                dino_stats = pet.dinoStats;
                break;
            }
        }
        createGame( dino_stats, name );
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
        
        if( age == 0 ) {
            createPet( dinostats, name );
        }
           
        boolean istrue = true;
        while( istrue = true ) {
            
            System.out.println( "What would you like to do?" );
            instruction = sc.nextLine();
            int random = ( int )( Math.random() * 5 );       

            hunger--;
            thirst--;;
            age++;

            if( instruction.equals( "END" ) ) { break; } 
            

            if( instruction.equals( "EAT" ) ) {
                hunger += random; 
                System.out.println( "Hunger:  "+ hunger +"[+"+ random +"]" );
                System.out.println( "Age:  "+ age );
            } else if( instruction.equals( "DRINK" ) ) {
                thirst += random;
                System.out.println( "Thirst:  "+ thirst +"[+"+ random +"]" );
                System.out.println( "Age:  "+ age );
            } else if( instruction.equals( "SAVE" ) ) {
                int[] dino_stats = new int[] { age, hunger, thirst };
                ammendPet( name, dino_stats );
            } else if( instruction.equals( "LEADER" ) ) {
                leaderPrint();              
            } else {
                System.out.println( "Sorry command not recognised. Available commands are SAVE, EAT, DRINK, END" );
            }
        }
    }
    public static void leaderPrint( ) 
    {
        int i = 0;
        for( DinoPet pet : pausedPets )
        {
            int[] leader = new int[3];
            String name = "";
            if( i == 0 )
            {
                name = pet.name;
                leader = pet.dinoStats;
                System.out.print( "The current oldest pet is "+ name +", ");
                System.out.println( "with an age of "+ leader[0] );
            }
            i++;
        }
    }
    public static void ammendPet( String name, int[] dinostats )
    {
        int[] dino_stats = new int[3];
        dino_stats = dinostats;
    
        int counter = 0;
        for( DinoPet pet : pausedPets )
        {
            if( pet.name.equals( name ) ) 
            {
                pet.dinoStats = dino_stats;
            } 
            try {
                outFile( "PausedPets.txt" );
                System.out.println( "SAVED" );
            } catch( IOException ioe ) {
            }
        }
    }   
    public static void createPet( int[] array, String name ) 
    {
        int[] dinoStats = new int[3];
        dinoStats = array; 
        pausedPets.add( new DinoPet( dinoStats, name ) );
    }
    
    public static void outFile( String textfile ) throws java.io.IOException 
    {
        File outFile = new File ( textfile );
        FileWriter fWriter = new FileWriter ( outFile, false );
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
/*    public static void sortInput( ) {
        for( DinoPet i : pausedPets ) {
            for( DinoPet j : pausedPets ) {
                if( i.dinoStats[0] > j.dinoStats[0] ) {
                    int[] temp_arr = new int[3];
                    String temp_name;
                    createPet( temp_arr, "temp" );

                    temp_arr = j.dinoStats;
                    temp_name = j.name;

                    j.dinoStats = i.dinoStats;
                    i.dinoStats = temp_arr;
                    sortInput();
                }
            }
            break;    
        }
    }*/
    /*public static int[] sortInput( int[] param )
    {
        for( int i = 0; i < 3; i++ )
        {
            for( int j = 0; i < 3; i++ )
            {
              
            }
        }
    }*/

    
    public static String namePet() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to name your pet");
        name = sc.nextLine();
        return name;
    }
    public static DinoPet setName( DinoPet pet, String name )
    {
        pet.name =  name;
        return pet;   
    }
}

class DinoPet {

    String name;
    int[] dinoStats = new int[3]; // dino stats are age hunger thirst in that order

    public DinoPet( int[] array, String param ) 
    {
        name = param;
        dinoStats = array;
    }   
}
