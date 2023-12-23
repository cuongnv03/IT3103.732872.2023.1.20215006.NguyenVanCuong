package media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    // Khởi tạo thuộc tính của DigitalVideoDisc
    public DigitalVideoDisc(String title) {
        super(title);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        setDirector(director);
        setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super(title, category, cost);
        setDirector(director);
    	setLength(length);
        setId(++nbDigitalVideoDiscs);
    }
    //Các phương thức constructor cho DVD, dùng super tới Media
    public String toString() {
    	// Phương thức chuyển các thông tin của DVD thành string rồi trả lại
        String dvd = getTitle() + " - " + getCategory() + " - " +
                getDirector() + " - "  + getLength() + " - " + getCost();
        return dvd;
    }

    public void play() {
    	//Method play cho interface playable
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}
