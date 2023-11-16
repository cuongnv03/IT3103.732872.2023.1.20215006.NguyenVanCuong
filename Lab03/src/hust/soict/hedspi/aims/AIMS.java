//Nguyen Van Cuong - 20215006
package hust.soict.hedspi.aims;

public class AIMS {
	public static void main(String[] args)
	{
		Cart anOrder = new Cart();
		// Tạo cart mới với tên anOrder
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Five Nights At Freddy's", "Horror", "Emma Tammi", 110, 110000);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new  DigitalVideoDisc("Past Lives", "Romatic", "Celine Song", 106, 140000);
		
		DigitalVideoDisc dvd3 = new  DigitalVideoDisc("The Creator", "Action", "Gareth Edwards", 133, 150000);
		anOrder.addDigitalVideoDisc(dvd2, dvd3);
		DigitalVideoDisc dvd4 = new  DigitalVideoDisc("The Lion King",
		"Animation", "Roger Allers", 87, 19.95f );
		DigitalVideoDisc dvd5 = new  DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f );
		DigitalVideoDisc dvd6 = new  DigitalVideoDisc("Aladin",
		"Animation", 18.99f );
		anOrder.addDigitalVideoDisc(dvd4,dvd5,dvd6);
		//Tạo các disc mới
		anOrder.showCart();
		//Liệt kê những disc đang có trong cart hiện thời
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		// Tính tổng chi phí của chúng
		System.out.println("Testing the removeDigitalVideoDisc method");
		anOrder.removeDigitalVideoDisc(dvd4);
		// Thử loại bỏ disc mới
		anOrder.removeDigitalVideoDisc(dvd3);
		// Thử loại bỏ disc 3
		anOrder.showCart();
		// Liệt kê những disc đang có trong cart sau khi loại bỏ
		System.out.println("dvd 4 id: " + dvd4.getId());
		System.out.println("dvd 5 id: " + dvd5.getId());
		// Test việc cấp phát id
	}
}