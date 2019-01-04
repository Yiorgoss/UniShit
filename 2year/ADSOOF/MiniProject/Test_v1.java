import java.util.*;

class Test_v1 {
	public static void main( String[] args){
		Scanner sc = new Scanner( System.in);
		WordGen word = new WordGen();
		word.initialise( sc);	//seed = 3 due to psuedo random nature of WordGen
		
		long time1, time2, time3;
		int n = 1000000;
		String[] test = new String[n];

		WordStoreImp ws1 = new WordStoreImp(n+2); //Class use over interface to allow test variables through 
		WordStore ws2 = new WordStoreImp( 2*n);	//Since no dynamic resizing is present
		//fill array with words

		/************************************************************************/
		System.out.println( "Time taken to create 1,000,000 words");
		System.out.println( "\t And test unused space");
		System.out.println( );
		//fill array with random words
		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			test[i] = ( word.make());
		}
		time2 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws1.add( test[i]);
		}
		System.out.println( "# null buckets--> "+ (n-ws1.used));
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");
		ws1 = new WordStoreImp(n);
		/************************************************************************/
		System.out.println( "Time taken to Add an extra 1,000,000 words");
		System.out.println( );

		String[] test2 = new String[n];
		for( int i=0; i<n; i++){
			test2[i] = word.make();
		}
		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.add( test[i]);
		}	

		time2 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws2.add( test2[i]);
		}
		time3 = new Date().getTime();
		System.out.println( "First million words");
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "Second million words");
		System.out.println( (time3 - time2)+ " ms");
		System.out.println( "=================================================");

		/************************************************************************/
		System.out.println( "Time taken to Remove 1,000,000 words");
		System.out.println( );

		for( int i=0; i<n; i++){
			ws1.add( test[i]);
		}	

		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws1.remove( test[i]);
		}
		time2 = new Date().getTime();
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");

		/************************************************************************/
		System.out.println( "Time taken Count 1,000,000 words");
		System.out.println( );

		ws1 = new WordStoreImp( n);
		for( int i=0; i<n; i++){
			ws1.add( test[i]);
		}	

		time1 = new Date().getTime();
		for( int i=0; i<n; i++){
			ws1.count( test[i]);
		}
		time2 = new Date().getTime();
		System.out.println( (time2 - time1) +" ms");
		System.out.println( "=================================================");
	}
}