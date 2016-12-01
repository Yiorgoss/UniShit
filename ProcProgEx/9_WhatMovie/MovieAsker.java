import java.util.Scanner;
import java.util.ArrayList;

public class MovieAsker
{
    public static ArrayList<Movie> Showing = new ArrayList<Movie>();
    public static void main( String[] p )
    {
        int[] time = new int[]{2,3};
        addMovie("what", time, 1 );       
        
        movieSetUp();
        displayMovies();
    }
   
    public static void displayMovies()
    {
        System.out.println( "CinemaWorld Film Tonight" );
        for( Movie movie : Showing) {
            System.out.print( "Screen "+ movie.screen_num +": "+ movie.name +"    " );
            System.out.println( movie.time[0] +":"+ movie.time[1] );
        }
    }
        
    public static void movieSetUp() 
    {   
        int screen_num = 1;
        while( screen_num <= 4 ) {
            String name;
            
            int[] time = new int[2];

            System.out.println( "Film for Screen "+ screen_num );
            name = userInput();
            
            System.out.println( "What time does it start? Hour" );
            String temp = userInput();
            time[0] = Integer.parseInt( temp );            

            System.out.println( "What time does it start? Minutes past the hour" );
            temp = userInput();
            time[1] = Integer.parseInt( temp );
             
            addMovie( name, time, screen_num );  
            screen_num++;
        }
    } 
    public static void addMovie( String name, int[] time, int screen_num )
    {
        String a = name;
        int[] b = new int[2];
        b = time;
        int c = screen_num;

        Showing.add( new Movie( a, b, c ) );
    }

    public static String userInput()
    {
        Scanner sc = new Scanner( System.in );
        String usrinp = sc.nextLine();
        return usrinp;
    }
}

class Movie
{
    String name;
    int[] time = new int[2];
    int screen_num;

    Movie( String str1, int[] arr, int var ) 
    {   
        name = str1;
        time = arr;
        screen_num = var;
    }
}
