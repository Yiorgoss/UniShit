import java.util.*;

class ShowGraph_v2 {
	public static void main( String[] args){

		// int n = 40;
		// WordStoreImp_v2 wsi = new WordStoreImp_v2(n);
		// WordGen word = new WordGen();
		// word.initialise( new Scanner( System.in));

		// for( int i=0; i<n; i++){
		// 	wsi.add( word.make());
		// }

		// System.out.println( wsi);


		WordStoreImp_v2 wsi = new WordStoreImp_v2(10);

		wsi.add("aaa"); 	wsi.add("aaa");	wsi.add("aaa");
		wsi.add("AaAaAa");	wsi.add("AaAaBB"); wsi.add("BBAaBB");

		System.out.println( wsi);
		// AaAaAa---1952508096
		// AaAaBB---1952508096
		// AaBBAa---1952508096
		// AaBBBB---1952508096
		// BBAaAa---1952508096
		// BBAaBB---1952508096
	}
}