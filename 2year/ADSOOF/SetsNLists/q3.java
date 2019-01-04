import java.util.*;

class q3 {
	public static void main( String[] args){
		String str1 = "1 2 2 2 3 4 5 5 5";
		String str2 = "55 11 44 22 33";
		String str3 = "44 1114 2 2124 100 10 1";

		Set<ArrayList<Integer>> hs = new HashSet<>();
		ArrayList<Integer> temp = new ArrayList<>();

		String[][] arr_str = { str1.split(" "), str2.split(" "), str3.split(" ")};
		for( String[] a : arr_str){
			for( String b : a){
				temp.add( Integer.parseInt( b));
			}	
			hs.add(temp);
			temp = new ArrayList<>();
		}

		for( ArrayList<Integer> a : hs){
			for( int b : a){
				System.out.println( b);
			}
			System.out.println( "-_-_-_-_-_-_");
		}

		//does not delete multiple values
	}
}