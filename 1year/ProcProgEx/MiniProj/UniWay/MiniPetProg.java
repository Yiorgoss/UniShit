import java.util.Scanner;

public class MiniPetProg
{
    public static void main( String[] p )
    {
        DinoPet[] pet = new DinoPet[2]; 
        Scanner sc = new Scanner( System.in );
                
   
        while( true )
        { // enter loop and get command
            
            System.out.println( "What would you like to do?" );
            sc.nextLine();

            printValues( pet );           
        }
    }
    public static DinoPet[] changeUser( DinoPets[] String name )
    {
        return pets;
    }
    public static DinoPet changeHungry( DinoPet[] pets )
    {
        pets[0].ishungry = opposite( pets[0].ishungry );
        pet[1].ishungry = opposite( pet[1].ishungry );
        return pets;
    }
    public static boolean opposite( boolean arg )
    {
        if( arg = true )
        {
            return false;
        } else {
            return true;
        }
    }
    public static void printValues( DinoPet pet )
    {
        System.out.println( "Name: "+ getName( pet ) );
        System.out.println( "Hunger:"+ getIsHungry( pet ) );
        System.out.println( "food Value"+ getFood_counter( pet ) );
    }
    public static String getName( DinoPet pet )
    {
        return pet.name;
    }  
    public static boolean getIsHungry( DinoPet pet )
    {
        return pet.ishungry;
    }
    public static int getFood_counter( DinoPet pet )
    {
        return pet.food_counter;
    }
}

class DinoPet 
{
    String name;
    boolean ishungry = false;
    int food_counter;
}
