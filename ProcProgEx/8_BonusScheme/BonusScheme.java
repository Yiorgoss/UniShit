import java.util.Scanner;

public class BonusScheme {
    public static void main( String[] param ) {
        System.out.println( "Profit Score");
        int profit_score = usrInput();    

        System.out.println( "Hard Work Score?");
        int hardwork_score = usrInput();

        int bonus_val = profitBonus( profitscore );
        int bonus_val += hardWorkBonus( hardwork_score );   
    }
    public static int usrInput() {
        Scanner sc = new Scanner( System.in );
        int input = sc.nextInt();
        return input;
    }

    public static int profitBonus( int param )
    {
        profitscore = param * 2;
        return profitscore;
    }
    
    public static int hardWorkBonus( int param) 
    {
        hardwork_score = param * 5
    }

    public static void hhh(){}
}

class Employee {

    public int profit_score = 0;
    public int hardwork_score = 0;

    public int getProfit( ) 
    {
        return profit_score;
    }
    public int getHardWork() 
    {
        return hardwork_score;
    }

    public void setProfit( int param ) 
    {
        profit_score = param;
    }
    public void setHardWork( int param ) 
    {
        hardwork_score = param;
    }

}
