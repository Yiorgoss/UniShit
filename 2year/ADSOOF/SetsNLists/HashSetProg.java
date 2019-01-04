import java.util.*;

class HashSetProg {
	public static void main( String[] args){
		String str = "a A b B cdef X";
		String[] arr = str.split(" ");

		Set<String> hs1 = new HashSet<>( Arrays.asList( arr));
		Set<String> hs2 = new HashSet<>();

		for( String a : arr){
			System.out.println( a);
			hs2.add( a);
		}
		System.out.println( "Print HashSet 1");
		for( String a : hs1){
			System.out.println( "\t"+ a);
		}
		System.out.println( "Print HashSet 2:");
		for( String a : hs2){
			System.out.println( "\t"+ a);
		}
		//Ordering is wrong. Is This what the exercise was trying to show?
		//use LinkedHashSet
	}
}