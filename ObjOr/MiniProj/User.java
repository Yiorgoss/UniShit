import java.util.*;
import java.io.*;

public class User {
    private String name;
    private int ID;
    private double balance;
    private ArrayList<Owned> ownStk = new ArrayList<Owned>();
    
    public User( String name, int ID, double balance ) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        
    }
    public User( String fname ) {
        try {
            BufferedReader br = new BufferedReader( new FileReader( fname+".txt" ));
            String line = "";
            while( (line = br.readLine()) != null ) {
                
                String[] array = line.split( "," );
                this.name = array[0];
                this.ID = Integer.parseInt( array[1] );
                this.balance = Double.parseDouble( array[2] );

            }            
        } catch( Exception e ) {
            System.out.println( "ERROR. SEE LOGS FOR MORE INFO" );

        }
    }
    public String getName() { return this.name; }
    public int getID() { return this.ID; }
    public double getBalance() { return this.balance; }
    public ArrayList<Owned> getOwned() {return this.ownStk;}
    
    public void buyStock( Owned own, double cost ) {
        if( this.ownStk == null ) {
            System.out.println("kjsdhfga");
        }
        this.ownStk.add( own );
        this.balance -= own.getAmount()*cost;
    }
    public void sellStock( Owned own, double cost ) {
        this.ownStk.remove( own );
        this.balance += own.getAmount()*cost;
    }
    public String saveStocks( ArrayList<Owned> own ) {
        String content = "";
        for( Owned stOwn : own ) {
            content = content+","+stOwn.getName()+","+stOwn.getAmount();
        }
        return content;
    }
}