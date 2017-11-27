public class RisingStock extends Stock {
    
    private boolean is_rising;
    //see Declinging Stock
    public RisingStock(   String name, double ask,
                    double bid, double fdchange ) {
        super( name, ask, bid, fdchange );
        if( fdchange >= 0 ) {
            this.is_rising = true;
        }
    }
    public boolean getIsRising() { return this.is_rising; }
}
