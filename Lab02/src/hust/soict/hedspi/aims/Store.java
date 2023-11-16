//Nguyen Van Cuong - 20215006
package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore = 
            new ArrayList<>(); 
    public void addDigitalVideoDisc (DigitalVideoDisc disc)
    {   // Method cho việc thêm disc
            //Thêm disc vào cart và thông báo thêm thành công
            itemsInStore.add(disc);
            System.out.println("The disc has been added");
    }
    
    public void removeDigitalVideoDisc (DigitalVideoDisc disc)
    {       // Method cho việc loại bỏ disc
            if (itemsInStore.isEmpty())
            {   //Nếu list trống thì thông báo cart trống
                System.out.println("The shop is empty");
                return;
            }
            if (itemsInStore.remove(disc))
            {   // Nếu loại bỏ thành công thì gửi thông báo
                System.out.println("The disc is removed successfully");
            }
            else
            {   // Nếu không loại bỏ thành công thì gửi thông báo disc không có trong cart
                System.out.println("The disc is not in the shop");
            }
        
    }
}