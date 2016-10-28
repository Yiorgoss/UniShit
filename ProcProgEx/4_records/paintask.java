import java.util.Scanner;

class paintask {
	
	public static void main (String[] p) {

		painting p1 = new painting();
		String usr_inp_string;
		int usr_inp_int;


		String admin_string;
		int admin_int;
		Scanner admin_sc = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		System.out.println("What room are you in?");
		usr_inp_string = sc.nextLine();
				

		if (usr_inp_string.equals("artist")) {
			System.out.println("What was the artist's name?");
			admin_string = admin_sc.nextLine();
			p1.setArtist(admin_string);
		} else if (usr_inp_string.equals("direction")) {
			System.out.println("What is the direction?");
			admin_string = admin_sc.nextLine();
			p1.setDirec(admin_string);
		} else if (usr_inp_string.equals("title")) {
			System.out.println("What is the painting title?");
			admin_string = admin_sc.nextLine();
			p1.setTitle(admin_string);
		} else if (usr_inp_string.equals("year")) {
			System.out.println("What year was it painted?");
			admin_int = admin_sc.nextInt();
			p1.setYear(admin_int);
		} else if (usr_inp_string.equals("height")) {
			System.out.println("What was the artist's name?");
			admin_int = admin_sc.nextInt();
			p1.setHeight(admin_int);
		} else if (usr_inp_string.equals("width")) {
			System.out.println("What was the artist's name?");
			admin_int = admin_sc.nextInt();
			p1.setWidth(admin_int);
		} else {
		
			System.out.println("The painting " + p1.getDirec() + " is by " + p1.getArtist() + " .It was painted in " + p1.getYear() + " and is called " + p1.getTitle() + " . It is of " + p1.getHeight() + " cm height and " + p1.getWidth() + " cm width.");
		}

	}
}
//paintings can be hardcoded in and changed once inside.
