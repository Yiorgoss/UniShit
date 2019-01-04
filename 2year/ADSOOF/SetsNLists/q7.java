import java.util.*;

class q7 {
	public static void main( String[] args){
		String str1 = "1 2 2 2 3 4 5 5 5";
		String str2 = "55 11 44 22 33";
		String str3 = "44 1114 2 2124 100 10 1";
		String str4 = "1 2 3 4 5";
		String str5 = "15";

		Set<List<Integer>> ts = new TreeSet<>( new CompareSum());
		ArrayList<Integer> temp = new ArrayList<>();

		String[][] arr_str = { str1.split(" "), str2.split(" "), str3.split(" "), str4.split(" "), str5.split(" ")};
		for( String[] a : arr_str){
			for( String b : a){
				temp.add( Integer.parseInt( b));
			}	
			ts.add(temp);
			temp = new ArrayList<>();
		}

		System.out.println( ts);
		ts = new TreeSet<>( new CompareSum());

	}
}