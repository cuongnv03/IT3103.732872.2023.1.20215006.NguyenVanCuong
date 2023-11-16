//Nguyen Van Cuong - 20215006
package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemOrdered = 
            new ArrayList<>(); 
    // Sử dụng list để tiện cho việc remove
    public void addDigitalVideoDisc (DigitalVideoDisc disc)
    {   // Method cho việc thêm disc
        if ( itemOrdered.size() == MAX_NUMBERS_ORDERED)
            { //Nếu kích thước của list = tối đa thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            // Nếu không thì thêm disc vào cart và thông báo thêm thành công
            itemOrdered.add(disc);
            System.out.println("The disc has been added");
           }
    }
    
    public void addDigitalVideoDisc (DigitalVideoDisc ... dvd)
    {   // Method cho việc thêm disc với arg tùy ý
        if ( itemOrdered.size() == MAX_NUMBERS_ORDERED)
            { //Nếu kích thước của list = tối đa thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            if ( itemOrdered.size() + dvd.length == MAX_NUMBERS_ORDERED)
             {  // Nếu cart không đủ chỗ để thêm list thì gửi thông báo
                System.out.println("There are not enough spots in the cart");
             }
            else
             {
                for (DigitalVideoDisc disc : dvd) {
                    itemOrdered.add(disc);
                // Dùng vòng lặp và thêm từ từ đĩa từ list vào
                }
                System.out.println("The list of discs has been added successfully");
             } 
           }
    }
    
    
    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 )
    {   // Method cho việc thêm disc với 2 arg
        if ( itemOrdered.size() + 2 >  MAX_NUMBERS_ORDERED)
            { //Nếu cart không đủ chỗ để chứa thì gửi thông báo thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            // Nếu không thì thêm disc vào cart và thông báo thêm thành công
            itemOrdered.add(dvd1);
            itemOrdered.add(dvd2);
            System.out.println("Both discs have been added");
           }
    }
    
    public void removeDigitalVideoDisc (DigitalVideoDisc disc)
    {       // Method cho việc loại bỏ disc
            if (itemOrdered.isEmpty())
            {   //Nếu list trống thì thông báo cart trống
                System.out.println("The cart is empty");
                return;
            }
            if (itemOrdered.remove(disc))
            {   // Nếu loại bỏ thành công thì gửi thông báo
                System.out.println("The disc is removed successfully");
            }
            else
            {   // Nếu không loại bỏ thành công thì gửi thông báo disc không có trong cart
                System.out.println("The disc is not in the cart");
            }
        
    }
    public float totalCost ()
    {   //Method tính tổng cost
        float total =0;
        for (DigitalVideoDisc disc : itemOrdered) {
             total += disc.getCost();
        }
        // Duyệt tuần tự qua cart và tính tổng cost
        return total;
    }
    
    public void showCart ()
    {   // Method để liệt kê những gì có trong cart và chi phí của chúng
        int i = 1;
        System.out.println("***********************CART***********************");
        for (DigitalVideoDisc disc : itemOrdered) {
             System.out.println(i + ".DVD - " + disc.toString());
             i++;
        // Duyệt lần lượt qua cart và in kết quả
        }
        System.out.print("Total Cost: ");
        System.out.println(totalCost());
        System.out.println("***************************************************");
    }
    
    public void searchByTitle(String Title)
    { // Method để tìm bằng title
        int count = 1;
        for (DigitalVideoDisc disc : itemOrdered) {
            if (disc.isMatch(Title))
                {// Duyệt lần lượt qua cart và kiểm tra xem title của dvd có chứa xâu dùng để tra không
                System.out.println(count + ".DVD -" + disc.toString());
                count ++;
                // nếu có thì in ra và tăng count
                }
            
       }
        if (count == 1)
        {   //Nếu count không đổi thì in ra không tìm được
            System.out.println("No results found");
        }
    }
    
    public void searchById(int Id)
    {   int count = 1;
        for (DigitalVideoDisc disc : itemOrdered) {
            if (Id == disc.getId())
                {// Duyệt tuần tự qua cart và kiểm tra xem id có trùng không
                System.out.println(count + ".DVD -" + disc.toString());
                count ++;
                //Nếu có thì in ra và tăng count rồi break vì id là duy nhất
                break;
                }
            
       }
        if (count == 1)
        {   // nếu count không đổi thì in ra là không tìm được
            System.out.println("No results found");
        }
        
    }
}