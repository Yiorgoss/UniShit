public class Stock {
    private String name;
    private double ask;
    private double bid;
    private double fdchange;
    
    //constructor
    public Stock(   String name, double ask,
                    double bid, double fdchange ) {
        this.name = name;
        this.ask = ask;
        this.bid = bid;
        this.fdchange = fdchange;
    }
    public String getName() { return this.name; }
    public double getAsk() { return this.ask; }
    public double getBid() { return this.bid; }
    public double getFdChange() { return this.fdchange; }
    
}
