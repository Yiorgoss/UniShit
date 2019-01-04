import java.util.*;

class q6 {
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

		CompareSum cs 		= new CompareSum();
		CompareLength cl 	= new CompareLength();

		temp = Collections.max( hs, cs);
		System.out.println( "Compare size: "+temp);

		temp = Collections.max( hs, cl);
		System.out.println( "Compare length: "+ temp);
	}
}