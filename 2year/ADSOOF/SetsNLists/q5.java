import java.util.*;

class q5 {
	public static void main( String[] args){
		Integer[] arr1 = { 1, 2, 3};

		ArrayList<Integer> temp = new ArrayList<Integer>( Arrays.asList(arr1));
		HashSet<List<Integer>> hs = new HashSet<>();
		hs.add( temp);

		Integer[] arr2 = { 5, 1, 3, 4, 2};
		temp = new ArrayList<Integer>( Arrays.asList( arr2));
		hs.add( temp);

		Integer[] arr3 = { 1, 2, 3, 4};
		temp = new ArrayList<Integer>( Arrays.asList( arr3));
		hs.add( temp);

		System.out.println( hs);
		System.out.println( longest( hs));
	}
	public static List<Integer> longest( HashSet<List<Integer>> hs){
		
		List<Integer> temp = new ArrayList<>();
		for( List<Integer> a : hs){
			if( temp.size() < a.size()){
				temp = a;
			}
		}
		return temp;
	}
}