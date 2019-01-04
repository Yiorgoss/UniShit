import java.util.*;

class TreeSetProg {
	public static void main( String[] args){
		String str = " a A b B cdef X";

		String[] arr = str.split(" ");

		Set<String> ts1 = new TreeSet<String>( Arrays.asList( arr));
		Set<String> ts2 = new TreeSet<String>();

		for( String a : arr){
			ts2.add( a);
		}

		System.out.println( "Print TreeSet 1");
		for( String a : ts1 ){
			System.out.println( "\t"+ a);
		}
		System.out.println( "Print TreeSet 2");
		for( String a : ts2){
			System.out.println( "\t"+ a);
		}
	}
}