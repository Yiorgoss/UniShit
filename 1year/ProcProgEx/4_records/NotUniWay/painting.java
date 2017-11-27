public class painting {
	
	int painting_num = 1;
	private String direction = "Insert direction";
	private String artist = "Insert Artist";
	private String title = "Insert Title";
	private int year = 000;
	private double height = 00.0;
	private double width = 00.0;

	/*Hardcoded examples for the example runs */

	public int getPainting(){
		return painting_num;
	}

	public void setDirec(String direction) {
		this.direction = direction;
	}

	public String getDirec() {
		 return direction;
	}
	
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		 return artist;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		 return title;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		 return year;
	}

				
	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		 return height;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		 return width;
	}
}
