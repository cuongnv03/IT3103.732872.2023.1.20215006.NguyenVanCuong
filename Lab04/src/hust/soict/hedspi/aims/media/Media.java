package media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	//Khởi tạo các thuộc tính của Media
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();
	//Các thuộc tính comparator
	public Media(String title) {
		super();
		this.title = title;
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
    //Các constructor
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	// Các getters và setters
	public boolean equals(Media o)
	{   //override equals, nếu cùng title thì trả về true
		if (title.equals(o.title))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isMatch(String tit) {
		//Method để kiểm tra trong title có chứa xâu tit không
		    return getTitle().contains(tit);
		}
	

	public Media() {
		
	}

}