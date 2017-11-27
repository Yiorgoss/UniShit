import java.util.Scanner;

public class BonusScheme {
    public static void main( String[] param ) {
        System.out.println( "Profit Score"); //Ask user for 2 variable
        int profit_score = usrInput();    

        System.out.println( "Hard Work Score?");
        int hardwork_score = usrInput();

        int performance_score = performanceScore( profit_score, hardwork_score );
        System.out.println( "Your Performance Score this year is "+  performance_score +" out of 10" );
   
        int bonus = finalBonus( performance_score );
        System.out.println( "Your bonus is £"+ bonus + ".");
    }
    public static int usrInput() { //Method for user input
        Scanner sc = new Scanner( System.in );
        int input = sc.nextInt();
        return input;
    }

    public static int profitBonus( int param ) //returns bonus for profit variable
    {
        int profitscore = param * 2;
        return profitscore;
    }
    
    public static int hardWorkBonus( int param) //returns bonus for hardwork variable 
    {
        int hardwork_score = param * 5;
        return hardwork_score;
    }

    public static int performanceScore( int profit, int hardwork ) // returns overall bonus multiplier for the profit and hardwork variables
    {
        int profitscore = profitBonus( profit );
        int hardworkscore = hardWorkBonus( hardwork );

        int finalscore = profitscore + hardworkscore;
        
        return finalscore / 7; 
    } // shouldnt this be a float value??

    public static int finalBonus( int param ) // returns final bonus which is the performance score multiplied by 5000
    {
        int bonus = param * 5000;
        return bonus; 
   }
}

class Employee //employee variables which default to zero. 
{
                
    public int profit_score = 0;
    public int hardwork_score = 0;

}
