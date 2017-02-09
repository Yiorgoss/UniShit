class TestAccelerate {
    public static void main( String[] args ) {
        SportsCar sport1 = new SportsCar();
        SportsCar sport2 = new SportsCar();
        SportsCar sport3 = new SportsCar();
        Van van = new Van();

            
        sport1.setHorsePower(200);
        sport2.setHorsePower(100);
        sport3.setHorsePower(135);
        van.setHorsePower(100);

        sport1.setWeight(1500);
        sport2.setWeight(1000);  
        sport3.setWeight(1100.2);
        van.setWeight(3500);
        

        van.setCarryWeight(160.4);
        van.setAerodynamics(0.9);
        
        System.out.println( "Accel sports car 1 = "+ sport1.acceleration() );    
        System.out.println( "Accel sports car 2 = "+ sport2.acceleration() );
        System.out.println( "Accel sports car 3 = "+ sport3.acceleration() );
        System.out.println( "Accel van = "+ van.acceleration() );
    }
        
}
