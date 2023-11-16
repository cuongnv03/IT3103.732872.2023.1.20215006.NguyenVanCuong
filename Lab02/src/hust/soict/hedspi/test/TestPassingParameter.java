//Nguyen Van Cuong - 20215006
package hust.soict.hedspi.test;
import hust.soict.hedspi.aims.*;
public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        changeTitle(jungleDVD, "Jungle");
    	//Chuyển tên jungleDVD về như cũ
    	swapCorrectly(jungleDVD,cinderellaDVD);
    	//Sử dụng method swap mới để đổi tên
    	System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    	System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    	//In ra kết quả
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void swapCorrectly(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
    	String tmp = dvd1.getTitle();
    	//lưu title của dvd1 vào biến tmp
    	dvd1.setTitle(dvd2.getTitle());
    	//Dùng setter chuyển title của dvd1 thành title của dvd2
    	dvd2.setTitle(tmp);
    	//Dùng setter chuyển title của dvd2 thành tmp
    }
}