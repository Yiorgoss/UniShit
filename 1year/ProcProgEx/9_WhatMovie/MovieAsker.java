import java.util.Scanner;
import java.util.ArrayList;

public class MovieAsker
{
    public static ArrayList<Movie> Showing = new ArrayList<Movie>(); //Abstract data type Movie. creating new arraylist of type "Movie" called "Showing"
    public static void main( String[] p )
    {
        movieSetUp(); //initiate movie setup
        displayMovies(); // display whatever movies were made
    }
   
    public static void displayMovies()
    {
        System.out.println( "CinemaWorld Film Tonight" );
        for( Movie movie : Showing) { //iterate through each Movie in "Showing". each Movie gets placeholder name "movie" 
            System.out.print( "Screen "+ movie.screen_num +": "+ movie.name +"    " ); //print so that newline isnt created.
            System.out.println( movie.time[0] +":"+ movie.time[1] ); //println for newline, print array values.
        }
    }
        
    public static void movieSetUp() // asks the user 4 times for movie names and showing times as well creating movie arraylist type once user asked.
    {   
        int screen_num = 1;
        while( screen_num <= 4 ) { // in this case 4 screens in cinema
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
             
            addMovie( name, time, screen_num ); //create movie in arraylist 
            screen_num++;
        }
    } 
    public static void addMovie( String name, int[] time, int screen_num ) //method to create movie
    { 
        String a = name;
        int[] b = new int[2];
        b = time;
        int c = screen_num;

        Showing.add( new Movie( a, b, c ) );
    }

    public static String userInput() // basic method to ask user for input
    {
        Scanner sc = new Scanner( System.in );
        String usrinp = sc.nextLine();
        return usrinp;
    }
}

class Movie //what is a movie..
{
    String name;
    int[] time = new int[2];
    int screen_num;

    Movie( String str1, int[] arr, int var ) //constructor for movie. acts as setter
    {   
        name = str1;
        time = arr;
        screen_num = var;
    }
}
