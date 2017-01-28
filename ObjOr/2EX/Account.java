import java.lang.Math;
class Account {
    private double balance;
    private double interestRate;

    public static void main( String[] args ) {
       
    }
    public Account( double initial_balance ) {
        balance = initial_balance;
    }
    public void deposit( double amount ) {
        balance += amount;   
    }
    public void withdraw( double amount ) {
        balance -= amount;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setInterest( double rate ) {
        interestRate = rate;    
    }
    public double computeInterest( int n ) {
        double compoundInterest = Math.pow( (interestRate + 1), n/12); 
        compoundInterest *= balance;
        return compoundInterest;
    }
}
