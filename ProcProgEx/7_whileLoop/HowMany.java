import java.util.Scanner;

class HowMany {

	public static void main( String[] p ){
		Scanner sc = new Scanner(System.in);
		String usr_str = "";
		String commonbird = "";
		
		int usr_int;	
		int mostcommon = 0;
		
		while( true ){
        // while condition = true ( always )	
		//ask user what bird was seen
        //record input
        // ask user how many were seen
        // record number of birds seen
        // output the greatest number of bird seen
        // only if user inputs end
        	System.out.println( "Which bird have you seen?" );
			usr_str = sc.nextLine();
			
			if(usr_str.equals( "end" ) ){
				System.out.println( "You saw "+ mostcommon +" "+ commonbird +"s" );
				break;
			} else {
		
			System.out.println("How many were in your garden at once?");
			usr_int = sc.nextInt();	
					
			sc.nextLine();
			}

			if(usr_int > mostcommon){
				mostcommon = usr_int;
				commonbird = usr_str;
			}
		}
	}
}
