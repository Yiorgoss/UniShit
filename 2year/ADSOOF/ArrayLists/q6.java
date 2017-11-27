import java.util.*; 

class q6 {

	public static void main( String[] args ) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		a.add(5);	a.add(12);	a.add(4);
		a.add(16); 	a.add(4);	a.add(2);

		b = constRemove( a, 4, 7 );
		System.out.println(a);
		System.out.println(b);

		destrRemove( a, 4, 7 );
		System.out.println(a);
	}
	public static <T> ArrayList<T> constRemove( ArrayList<T> arrlist, T a, T b ) {

		ArrayList<T> ret_arr = new ArrayList<T>(arrlist);
		Iterator<T> iter = ret_arr.iterator();
		int i = 0;

		while( iter.hasNext() ) {
			T elem = iter.next();
			if( elem == a ) {
				ret_arr.set( i, b );
			}
			i++;
		}
		return ret_arr;
	}
	public static <T> void destrRemove( ArrayList<T> arrlist, T a, T b ) {

		Iterator<T> iter = arrlist.iterator();
		int i = 0;

		while( iter.hasNext() ) {
			T elem = iter.next();
			if( elem == a ) {
				arrlist.set( i, b);				
			}
			i++;
		}
	}
}