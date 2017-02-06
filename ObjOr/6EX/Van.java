class Van extends Vehicle {
    private double carryweight;

    public static void main( String[] args ) {
        
    }
    public double acceleration() {
        return ( ( 100/getHorsePower() )*( getAerodynamics()/2 )*( ( getWeight() + getCarryWeight() )/100 ) );
        // how exactly does an increase in weight lead to an increase in acceleration??
    }
    public double getCarryWeight() { return this.carryweight; }
    public void setCarryWeight( double arg ) { this.carryweight = arg; }
}
