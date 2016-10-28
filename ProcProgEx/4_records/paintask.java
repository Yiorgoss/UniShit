import java.util.Scanner;

class paintask {
	
	public static void main (String[] p) {

		painting p1 = new painting();
		String usr_inp_string = "";
		//	int usr_inp_int;


		String admin_string;
		int admin_int;
		double admin_double;
		Scanner admin_sc = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		System.out.println("What room are you in?");
		
		while (!usr_inp_string.equals("exit")) {
			usr_inp_string = sc.nextLine();

			if (usr_inp_string.equals("artist")) {
				System.out.println("What was the artist's name?");
				admin_string = admin_sc.nextLine();
				p1.setArtist(admin_string);
				System.out.println("What next?");
			} else if (usr_inp_string.equals("direction")) {
				System.out.println("What is the direction?");
				admin_string = admin_sc.nextLine();
				p1.setDirec(admin_string);
				System.out.println("What next?");
			} else if (usr_inp_string.equals("title")) {
				System.out.println("What is the painting title?");
				admin_string = admin_sc.nextLine();
				p1.setTitle(admin_string);
				System.out.println("What next?");
			} else if (usr_inp_string.equals("year")) {
				System.out.println("What year was it painted?");
				admin_int = admin_sc.nextInt();
				p1.setYear(admin_int);
				System.out.println("What next?");
			} else if (usr_inp_string.equals("height")) {
				System.out.println("What is the height of painting?");
				admin_double = admin_sc.nextDouble();
				p1.setHeight(admin_double);
				System.out.println("What next?");
			} else if (usr_inp_string.equals("width")) {
				System.out.println("What is the width of painting?");
				admin_double = admin_sc.nextDouble();
				p1.setWidth(admin_double);
				System.out.println("What next?");
			} else {
				System.out.println("The painting " + p1.getDirec() + " is by " + p1.getArtist() + ". It was painted in " + p1.getYear() + " and is called " + p1.getTitle() + ". It is of " + p1.getHeight() + " cm height and " + p1.getWidth() + " cm width.");
				break;
			}
		}
	}
}
/* painting is hardcoded in, however can be adjusted inside. Working with multiple paintings would require creation another class, Room to list the different paintings in the same room.
  this currently works for only one painting.
  I was afraid to take this too far have multiple paintings or multiple rooms, however I can add this functionality in relatively easily
  The only issue is that now the first question is obsolete because it will merely print the current painting (which is hardcoded).
  You have to add in any changes you wish to make (by writing down the variable you wish to change and then the value for it).*/
