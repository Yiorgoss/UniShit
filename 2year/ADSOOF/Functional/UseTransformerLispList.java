import java.util.Scanner;

class UseTransformerLispList {
	public static void main( String[] args){
		Scanner sc = new Scanner( System.in);
		System.out.println( "Enter a list of numbers");
		String str = sc.nextLine();
		LispList<Integer> ll = parseLispList( str);
		Transformer<Integer> trans = new TenTimes();
		ll = Transformers.transformList( trans, ll);

		System.out.println( ll);
	}
	public static LispList<Integer> parseLispList( String arg){
		String line = arg.trim();
		String[] nums = line.split(" ");
		LispList<Integer> ll = LispList.empty();

		for( int i=nums.length-1; i>=0; i--){
			ll = ll.cons( Integer.parseInt( nums[i]));
		}
		return ll;
	}
}