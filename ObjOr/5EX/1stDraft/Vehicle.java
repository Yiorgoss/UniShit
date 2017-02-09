class Vehicle {
    
    private double horsepower;
    private double aerodynamics;
    private double weight;

    public static void main( String[] args ) {

    }
    public double getHorsePower(){ return this.horsepower; }
    public double getAerodynamics(){ return this.aerodynamics; }
    public double getWeight(){ return this.weight; }

    public void setHorsePower( double var ){ this.horsepower = var; }
    public void setAerodynamics( double var ){ this.aerodynamics = var; }
    public void setWeight( double var ){ this.weight = var; }   
    
    public double acceleration() {
        return ( ( 100/horsepower )*( aerodynamics )*( weight/100 ) );
    }
}   
