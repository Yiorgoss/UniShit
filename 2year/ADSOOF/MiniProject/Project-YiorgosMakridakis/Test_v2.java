import java.util.*;

class Test_v2 {
	public static void main( String[] args){
		Scanner sc = new Scanner( System.in);
		WordGen word = new WordGen();
		word.initialise( sc);	//seed = 3 due to psuedo random nature of WordGen
		
		long time1,time2,time3;
		int n = 1000000;
		String[] test = new String[n];
		String[] test2 = new String[n];
		WordStoreImp_v2 ws2 = new WordStoreImp_v2(n); //Class use over interface to allow test variables through 

		/************************************************************************/
		System.out.println( "Time taken to create 1,000,000 words");
		System.out.println( );
		//fill array with random words
		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			test[i] = ( word.make());
		}
		time2 = new Date().getTime();
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");

		ws2 = new WordStoreImp_v2( 2*n);	//since there is no dynamic resizing 
		/************************************************************************/
		System.out.println( "Time taken to Add an extra 1,000,000 words");
		System.out.println( );

		for( int i=0; i<n; i++){
			test2[i] = ( word.make());
		}
		for( int i=0; i<n; i++){
			test[i] = ( word.make());
		}

		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.add( test2[i]);
		}	

		time2 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.add( test[i]);
		}
		time3 = new Date().getTime();
		System.out.println( "First million:  " + (time2-time1)+" ms" );
		System.out.println( "Second million:  "+(time3 - time2) +" ms");
		System.out.println( "=================================================");

		ws2 = new WordStoreImp_v2( n);
		/************************************************************************/
		System.out.println( "Time taken to Remove 1,000,000 words");
		System.out.println( );

		for( int i=0; i<n; i++){
			ws2.add( test[i]);
		}	

		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.remove( test[i]);
		}
		time2 = new Date().getTime();
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");

		ws2 = new WordStoreImp_v2(n);
		/************************************************************************/
		System.out.println( "Time taken Count 1,000,000 words");
		System.out.println( );

		for( int i=0; i<n; i++){
			ws2.add( test[i]);
		}	

		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.count( test[i]);
		}
		time2 = new Date().getTime();
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");
	}
}