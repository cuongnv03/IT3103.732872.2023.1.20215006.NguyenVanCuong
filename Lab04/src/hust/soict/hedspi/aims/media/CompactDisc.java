package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    //khởi tạo các thuộc tính của dvd
    public CompactDisc(String title) {
        super(title);
    }
    
    public CompactDisc(String title, String category, float cost) {
        super(title,category,cost);
    }
    
    public CompactDisc(String director, int length, String artist) {
        super(director, length);
        this.artist = artist;
    }
    //Các constructor cho CD
    public String getArtist() {
        return artist;
    }
    // Getter để lấy Artist
    

    public void addTrack(Track trackName)
    {   // Method cho việc thêm track
        if ( tracks.contains(trackName))
            { //Kiểm tra xem track có trong list chưa
             System.out.println("The track is already presented");
             return;
            }
        else 
           {
            // Nếu không thì thêm vào và thông báo thêm thành công
            tracks.add(trackName);
            System.out.println("Track has been added successfully");
           }
    }
    
    public void removeTrack(Track trackName)
    {   // Method cho việc xoa track
        if ( tracks.contains(trackName))
            { //Kiểm tra xem tên có trong list chưa
             tracks.remove(trackName);
             System.out.println("The track has been removed successfully");
             return;
            }
        else 
           {
            // Nếu không thì báo
            System.out.println("This track is not presented, can't remove it");
           }
    }
    
    public int getLength ()
    {   //Method tính length
        int total =0;
        for (Track track : tracks) {
             total += track.getLength();
        }
        // Duyệt tuần tự qua tracks và tính tổng thời gian
        return total;
    }
     
    public void play()
    {   //Method để play
        System.out.println("Total track: " + tracks.size());
        System.out.println("Total runtime " + getLength());
        for (Track track : tracks) {
             track.play();
        }
        // Duyệt tuần tự qua tracks và play
        return;
    }
    
       public String toString() 
        {// Phương thức chuyển các thông tin của CD thành string rồi trả lại
            String cd;
            cd =    getTitle()+ " - " + getCategory() + " - " + getDirector()+ " - "  +getArtist() + " - "  +getLength();
            return cd;
        }
        
}
