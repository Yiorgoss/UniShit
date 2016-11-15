import java.util.Scanner;

class paintask {
	
	public static void main (String[] p) {

		painting_array[] painting = new painting[5];
		
		for (int i = 0; i < painting_array.length; i++) {
			painting_array[i] = new painting;
		}
		
		String usr_inp_string = "";
		int usr_inp_int;


		String admin_string;
		int admin_int;
		double admin_double;
		Scanner admin_sc = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		
		
		try 
		{
		
			System.out.println("What room are you in?");
			int room_num = sc.nextInt();
			
				for (int i = 1; i == painting_array.length; i++) {
			
					("What room are you in?");
					usr_inp_int = sc.nextInt();
					p = painting_array[usr_inp_int - 1];	
				
					System.out.println("The painting " + p.getDirec() + " is by " + p.getArtist() + ". It was painted in " + p.getYear() + " and is called " + p.getTitle() + ". It is of " + p.getHeight() + " cm height and " + p.setWidth() + " cm width.");
			}
		}	
		catch(InputMismatchException exception)
	   	{		

				while (!usr_inp_string.equals("exit")) {
				
						System.out.println("Whats next?");
						usr_inp_string = admin_sc.nextLine();
					
					if (usr_inp_string.equals("artist")) {
						System.out.println("What was the artist's name?");
						admin_string = admin_sc.nextLine();
						p.setArtist(admin_string);
					} else if (usr_inp_string.equals("direction")) {
						System.out.println("What is the direction?");
						admin_string = admin_sc.nextLine();
						p.setDirec(admin_string);
					} else if (usr_inp_string.equals("title")) {
						System.out.println("What is the painting title?");
						admin_string = admin_sc.nextLine();
						p.setTitle(admin_string);
					} else if (usr_inp_string.equals("year")) {
						System.out.println("What year was it painted?");
						admin_int = admin_sc.nextInt();
						p.setYear(admin_int);
					} else if (usr_inp_string.equals("height")) {
						System.out.println("What is the height of painting?");
						admin_double = admin_sc.nextDouble();
						p.setHeight(admin_double);
					} else if (usr_inp_string.equals("width")) {
						System.out.println("What is the width of painting?");
						admin_double = admin_sc.nextDouble();
						p.setWidth(admin_double);
					} else {
						System.out.println("Command Not Available. Try Again.");
					}
				}
		}
	}
}
/* painting is hardcoded in, however can be adjusted inside. Working with multiple paintings would require creation another class, Room to list the different paintings in the same room.
  this currently works for only one painting.
  I was afraid to take this too far have multiple paintings or multiple rooms, however I can add this functionality in relatively easily
  The only issue is that now the first question is obsolete because it will merely print the current painting (which is hardcoded).
  You have to add in any changes you wish to make (by writing down the variable you wish to change and then the value for it).*/
