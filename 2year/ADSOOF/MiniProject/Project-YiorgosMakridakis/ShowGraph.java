import java.util.*;

class ShowGraph {
	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		WordGen wg = new WordGen( );
		wg.initialise( sc); //seed 3 -> due to psudo randomness of words

		WordStoreImp wsi = new WordStoreImp( 41);

		for( int i=0; i<40; i++){
			wsi.add( wg.make());
		}
		System.out.println( wsi);

	}
}