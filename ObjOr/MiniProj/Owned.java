public class Owned {
    private String name = "";
    private int amount = 0;
    
    //constructor owned stocks of user
    public Owned( String name, int amount ) {
        this.name = name;
        this.amount = amount;
    }
    public String getName() { return this.name; }
    public int getAmount() { return this.amount; }
    public void addAmount( int amount ) { this.amount += amount; }
    public void sellAmount( int amount ) { this.amount += amount; }
}