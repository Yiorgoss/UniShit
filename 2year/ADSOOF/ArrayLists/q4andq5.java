import java.util.*;

class q4and5 {

	public static void main( String[] args ) {

		ArrayList<String> arrlist1 = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		
		arrlist1.add("tomato");		arrlist1.add("cheese");
		arrlist1.add("chips");		arrlist1.add("fruit");
		arrlist1.add("pie");		arrlist1.add("butter");
		arrlist1.add("tea");		arrlist1.add("buns");

		arrlist2 = constRem( arrlist1, 4 );
		prntAL(arrlist1);
		prntAL(arrlist2);

		destRem( arrlist1, 4 );
		prntAL(arrlist1);

	}	
	public static ArrayList<String> constRem( ArrayList<String> arrlist, int size ) {
		
		ArrayList<String> temp_arrlist = new ArrayList<String>(arrlist);
		Iterator<String> iter = temp_arrlist.iterator();

		while( iter.hasNext() ) {
			String str = iter.next();
			if( str.length() < size ) {
				iter.remove();
			}
		}
		return temp_arrlist;	
	}
	public static void destRem( ArrayList<String> arrlist, int size ) {

		Iterator<String> iter = arrlist.iterator();

		while( iter.hasNext() ) {
			String str = iter.next();
			if( str.length() < size ) {
				iter.remove();
			}
		}
	}
	public static void prntAL( ArrayList<String> arrL) {

		for( String a : arrL ) {
			System.out.print("\t"+ a);
		}
		System.out.println();
		System.out.println();
	}
}