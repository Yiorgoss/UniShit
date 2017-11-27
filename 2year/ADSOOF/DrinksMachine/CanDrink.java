class CanDrink {

    public static void main( String[] a ) {
        Can can1 = new Can( "Coke");
        Can can2 = new Can( "Dr Pepper");
               
        //can1.drink();        
        twoCans( can1, can2 );
    }
    public static void twoCans( Can A, Can B ){
        if( A.isFull() == true ) {
            System.out.println( A +" has been drunk" );
            A.drink();

        } else if (( A.isFull() == false ) && ( B.isFull() == true )) {
            System.out.println( B +" has been drunk because the other can is empty" );
            B.drink();

        } else {
            System.out.println( "Both cans are empty" );

        }
    }
}
