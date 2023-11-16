//Nguyen Van Cuong - 20215006

package hust.soict.hedspi.aims;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	// Khởi tạo thuộc tính của DigitalVideoDisc
	private static int nbDigitalVideoDiscs = 0;
	//Khởi tạo biến static nbDigitalVideoDiscs để quản lý id
 public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	// Các phương thức getter cho từng thuộc tính
public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDiscs;
		// Lấy số id hiện có tăng lên 1 rồi gán cho object khi được khởi tạo
	}

public DigitalVideoDisc(String title, String category, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.cost = cost;
	this.id = ++nbDigitalVideoDiscs;
}

public DigitalVideoDisc(String title, String category, String director, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.cost = cost;
	this.id = ++nbDigitalVideoDiscs;
}

public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.length = length;
	this.cost = cost;
	this.id = ++nbDigitalVideoDiscs;
}
// Các phương thức constructor
public void setTitle(String title) {
		  this.title = title;
	    }
	   //Setter cho title
public String toString() 
	{// Phương thức chuyển các thông tin của DVD thành string rồi trả lại
		String dvd;
		dvd = getTitle() + " - " + getCategory() + " - " +
				getDirector() + " - "  +getLength() + " - " + getCost();
		return dvd;
	}
	public boolean isMatch(String tit){  
		//Method để kiểm tra trong title của dvd có chứa xâu tit không
		if (title.contains(tit))
	   {
		return true;
	   }
	     else
	     {
	      return false;
	     }
	}
}