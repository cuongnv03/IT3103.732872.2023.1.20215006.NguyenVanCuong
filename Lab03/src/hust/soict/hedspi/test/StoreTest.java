//Nguyen Van Cuong - 20215006
package hust.soict.hedspi.test;
import hust.soict.hedspi.aims.*;
public class StoreTest {
	public static void main(String[] args) {
		 Store aStore = new Store();
		    // Tạo store mới với tên aStore
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
			                 "Animation", "Roger Allers", 87, 19.95f );
		    aStore.addDigitalVideoDisc(dvd1);
		    
		    DigitalVideoDisc dvd2 = new  DigitalVideoDisc("Star Wars",
	                "Science Fiction", "George Lucas", 87, 24.95f );
		    aStore.addDigitalVideoDisc(dvd2);
		    
		    DigitalVideoDisc dvd3 = new  DigitalVideoDisc("Aladin",
	                "Animation", 18.99f );
		    aStore.addDigitalVideoDisc(dvd3);
		 // Tạo các dvd và thêm vào store
		    aStore.removeDigitalVideoDisc(dvd3);
		    aStore.removeDigitalVideoDisc(dvd3);
		 // Xóa dvd khỏi store
	}
}