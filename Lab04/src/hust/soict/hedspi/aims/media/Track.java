package media;

public class Track implements Playable {
	private String title;
	private int length;
	
	//Các thuộc tính của track
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}

    //Các getter
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
    //Constructor cho track
	public boolean equals(Track o)
	{//Override equals, nếu cùng title và length thì trả về true
		if (title.equals(o.title))
		{  
			if (length == o.length )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	   public String toString() 
		{// Phương thức chuyển các thông tin của DVD thành string rồi trả lại
			String track;
			track = getTitle() + " - " +getLength() ;
			return track;
		}
		
	
	public void play() {
		//Method thực hiện interface playable
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}

}
