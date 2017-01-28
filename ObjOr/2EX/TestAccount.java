public class TestAccount {
    public static void main( String[] args ) {
        Account account1 = new Account( 500 );
        Account account2 = new Account( 100 );
        
        account1.setInterest( 0.1 );
        account2.setInterest( 0.1 );          
        
        System.out.println( "After 12 months account1 = "+ account1.computeInterest(12) +" account2 = "+ account2.computeInterest(12) );

        System.out.println( "After 24 months account1 = "+ account1.computeInterest(24) +" account2 = "+ account2.computeInterest(24) );
    }
}
