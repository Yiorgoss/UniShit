import java.util.Scanner;

class UseTransformers5 {
	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println( "Enter a Word");
		String str = sc.nextLine();
		Transformer<String> tran = new GenHelloAdder( str);

		System.out.println( "Enter another Word");
		str = sc.nextLine();

		System.out.println( "adding first word to second gives "+ tran.transform( str));
	}
}