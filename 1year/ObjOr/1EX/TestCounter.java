//import Counter.java;
public class TestCounter {
    
    public static void main( String[] args ) {

        Counter ctr = new Counter();
    
        ctr.increment();
        ctr.increment(); //ctr count should be 2 now

        System.out.println( "Count = "+ ctr.getCount() );
    
        ctr.reset();

        System.out.println( "Count = "+ ctr.getCount() );
    }
}
