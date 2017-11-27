import java.util.Scanner;

public class AskPaint {
    public static void main( String[] p ) 
    {
        Scanner sc = new Scanner( System.in );

        Painting p1 = new Painting();
        Painting p2 = new Painting();
        Painting p3 = new Painting(); // creating paintings

        setTitle( p1, "Girl with Chrysanthemums" ); // Setting up paintings
        setDirection( p1, "left" );
        setArtist( p1, "Olga Boznanska" );
        setYear( p1, 1894 );
        setRoom_Num( p1, 3 );
        setHeight( p1, 88.5);
        setWidth( p1, 69.0);

        setDirection( p2, "ahead of you" );
        setArtist( p2, "Mary Cassatt" );
        setTitle( p2, "Woman with a Pearl Necklace" );
        setYear( p2, 1879 );
        setRoom_Num( p2, 1 );
        setHeight( p2, 81.3 );
        setWidth( p2, 59.7 );

        setDirection( p3, "right" );
        setArtist( p3, "Claude Monet" );
        setTitle( p3, "Impression, Sunrise" );
        setYear( p3, 1872 );
        setRoom_Num( p3, 4 );
        setHeight( p3, 48.0 );
        setWidth( p3, 63.0 );

        while( true )
        { // while true ask user for input
            System.out.println( "What room are you in" );
            int usr_inp = sc.nextInt( );           
            
            // if user input matches room number of paitning Print info to via getters
            if( usr_inp == getRoom_num( p1 ) ) 
            {
                System.out.println( "The painting on your "+ getDirection( p1 ) +" is by "+ getArtist( p1 ) +". It is called "+ getTitle( p1 ) +". It is "+ getHeight( p1 ) + "cm by "+ getWidth( p1 ) +"cm."  );   
            } else if( usr_inp == getRoom_num( p2 ) )
            {
                System.out.println( "The painting on your "+ getDirection( p2 ) +" is by "+ getArtist( p2 ) +". It is called "+ getTitle( p2 ) +". It is "+ getHeight( p2 ) + "cm by "+ getWidth( p2 ) +"cm."  );
            } else if( usr_inp == getRoom_num( p3 ) )
            {
                System.out.println( "The painting on your "+ getDirection( p3 ) +" is by "+ getArtist( p3 ) +". It is called "+ getTitle( p3 ) +". It is "+ getHeight( p3 ) + "cm by "+ getWidth( p3 ) +"cm."  );
            } else {
                System.out.println( "Room Not Found" );
            }       
        }  
    }
    // getters
    public static int getRoom_num( Painting p )
    {
        return p.room_num;
    }
    public static int getYear( Painting p )
    {
        return p.year;
    }
    public static String getDirection( Painting p )
    {
        return p.direction;
    }
    public static String getTitle( Painting p ) 
    {
        return p.title;
    }
    public static String getArtist( Painting p )
    {
        return p.artist;
    }
    public static Double getHeight( Painting p )
    {
        return p.height;
    }
    public static Double getWidth( Painting p )
    {
        return p.width;
    }
    // setters
    public static void setTitle( Painting p, String a )
    {
        p.title = a;
    }     
    public static void setDirection( Painting p, String a )
    {
        p.direction = a;
    }     
    public static void setArtist( Painting p, String a )
    {
        p.artist = a;
    }     
    public static void setRoom_Num( Painting p, int a )
    {
        p.room_num = a;
    }     
    public static void setYear( Painting p, int a )
    {
        p.year = a;
    }     
    public static void setHeight( Painting p, double a )
    {
        p.height = a;
    }
    public static void setWidth( Painting p, double a )
    {
        p.width = a;
    }     
}
class Painting
{ //painting class
    int room_num, year;
    String direction, title, artist;
    double height, width;
}
