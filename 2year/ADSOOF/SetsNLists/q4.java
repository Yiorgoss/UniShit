import java.util.*;

class q4 {
	public static void main( String[] args){
		String str1 = "1 2 2 2 3 4 5 5 5";
		String str2 = "55 11 44 22 33";
		String str3 = "44 1114 2 2124 100 10 1";

		List<Set<Integer>> arrl1 = new ArrayList<Set<Integer>>();
		List<Set<Integer>> arrl2 = new ArrayList<Set<Integer>>();
		Set<Integer> temp = new HashSet<>();

		String[][] arr_str = { str1.split(" "), str2.split(" "), str3.split(" ")};
		for( String[] a : arr_str){
			for( String b : a){
				temp.add( Integer.parseInt( b));
			}	
			arrl1.add(temp);
			temp = new TreeSet<>();
		}

		temp = new TreeSet<>();
		for( String[] a : arr_str){
			for( String b : a){
				temp.add( Integer.parseInt(b));
			}
			arrl2.add(temp);
			temp = new TreeSet<>();
		}

		System.out.println( "\tPrint HashSet");
		for( Set<Integer> a : arrl1){
			for( int b : a){
				System.out.println( "\t\t"+ b);
			}
			System.out.println( "\tNext Set -----");
		}		

		System.out.println( "\tPrint TreeSet");
		for( Set<Integer> a : arrl2){
			for( int b : a){
				System.out.println( "\t\t"+ b);
			}
			System.out.println( "\tNext Set -----");
		}
	}
}