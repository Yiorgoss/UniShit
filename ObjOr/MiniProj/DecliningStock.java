public class DecliningStock extends Stock {
    private boolean is_rising;
    
    //constructor
    // uses parent class constructor
    public DecliningStock(   String name, double ask,
                    double bid, double fdchange ) {
        super( name, ask, bid, fdchange );
        if( fdchange <= 0 ) {
            this.is_rising = false;
        }
    }
    public boolean getIsRising() { return this.is_rising; }

}
