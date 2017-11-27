import java.util.*;

class q12 {

	public static void main( String[] args ) {
		ArrayList<String> str_arrl = new ArrayList<String>();
		ArrayList<String> new_arrl = new ArrayList<String>();

		str_arrl.add("buns"); 	str_arrl.add("cheese");		str_arrl.add("chips");
		str_arrl.add("fruits");		str_arrl.add("pie"); 		str_arrl.add("butter");
		str_arrl.add("tea"); 		str_arrl.add("buns"); 		str_arrl.add("chips");

		new_arrl = reverseTrim( str_arrl, "chips", "buns" );
		System.out.println( new_arrl );
	}
	public static <T> ArrayList<T> reverseTrim( ArrayList<T> arrl, T a, T b ) {

		ArrayList<T> ret_arrl = new ArrayList<T>();
		for( int i=arrl.size()-1; i>0; i-- ) {
			if( arrl.get(i).equals(b) ) {
				for( int j=i; j>0; j-- ) {
					ret_arrl.add( arrl.get(j));
					if( arrl.get(j).equals(a) ) { break; }
				}
			}
		}
		return ret_arrl;
	}
}