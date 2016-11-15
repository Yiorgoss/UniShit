import java.util.Scanner;

class Ask {

	public static void main (String[] p) {
		
		Scanner sc = new Scanner(System.in);
		int usr_inp_int = sc.nextInt();
		
		Painting p1 = new Painting();		
		p1.setRoomNumber(3);
		p1.setDirection("left");
		p1.setArtist("Olga Bonznanska");
		p1.setTitle("Girl with Chrysanthemums");
		p1.setYear(1894);
		p1.setHeight(88.5);
		p1.setWidth(69.0);
	}	

	public static int  {


	}

	public class Painting {

		private int room_num;
		private String direction;
		private String artist;
		private String title;
		private int year;
		private double height;
		private double width;	   

		public void setTitle(String p) {
			Painting.title = p;
		}
		public void setArtist(String p) {
			Painting.artist = p;
		}
		public void setDirection(String p) {
			Painting.direction = p;
		}
		public void setYear(int p) {
			Painting.year = p;
		}
		public void setHeight(double p) {
			Painting.height = p;	
		}
		public void setWidth(double p) {
			Painting.width = p;
		}
		public String getTitle() {
			return title;
		}
		public String getArtist() {
			return artist;
		}
		public String getDirection() {
			return direction;
		}
		public int getYear() {
			return year;
		}
		public double getHeight() {
			return height;
		}
		public double getWidth() {
			return width;
		}
	}
}
