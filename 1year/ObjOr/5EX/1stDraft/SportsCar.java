class SportsCar extends Vehicle {
    
    private double topspeed;
    
    public static void main( String[] args ) {
    
    }
        
    public SportsCar() {
        this.setAerodynamics(0.5);
    }
    public double getTopSpeed( ) { return this.topspeed; }
    public void setTopSpeed( double arg ) { this.topspeed = arg; }
}
