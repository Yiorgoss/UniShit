import java.util.*;

class test {
	public static void main( String[] args){
		//test with 1,000,000 random words

		Scanner sc = new Scanner(System.in);
		WordGen wg = new WordGen();
		wg.initialise(sc);
		int n =1000000;
		WordStore ws = new WordStoreImp( n);

		long time = new Date().getTime();
		for( int i=1; i<=n; i++){
			ws.add( wg.make());
		}


		//first 3 value with calculated with seed=3 -> scaky sazu nanthipro
		System.out.println( "number of duplicates "+ ws.count( "scaky"));
		System.out.println( new Date().getTime() - time +" ms");
	}
}