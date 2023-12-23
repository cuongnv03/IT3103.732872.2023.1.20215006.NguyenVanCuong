package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.*;
public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemOrdered = 
            new ArrayList<>(); 
    // Sử dụng list để tiện cho việc remove
    public void addMedia (Media item)
    {   // Method cho việc thêm media
        if ( itemOrdered.size() == MAX_NUMBERS_ORDERED)
            { //Nếu kích thước của list = tối đa thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            // Nếu không thì thêm media vào cart và thông báo thêm thành công
            itemOrdered.add(item);
            System.out.println("The item has been added");
           }
    }
    
    public void addMedia (Media ... item)
    {   // Method cho việc thêm disc với arg tùy ý
        if ( itemOrdered.size() == MAX_NUMBERS_ORDERED)
            { //Nếu kích thước của list = tối đa thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            if ( itemOrdered.size() + item.length == MAX_NUMBERS_ORDERED)
             {  // Nếu cart không đủ chỗ để thêm list thì gửi thông báo
                System.out.println("There are not enough spots in the cart");
             }
            else
             {
                for (Media it : item) {
                    itemOrdered.add(it);
                // Dùng vòng lặp và thêm từ từ item từ list vào
                }
                System.out.println("The list of items has been added successfully");
             } 
           }
    }
    
    public void addMedia (Media item1, Media item2 )
    {   // Method cho việc thêm media với 2 arg
        if ( itemOrdered.size() + 2 >  MAX_NUMBERS_ORDERED)
            { //Nếu cart không đủ chỗ để chứa thì gửi thông báo thì gửi thông báo
             System.out.println("The cart is almost full");
             return;
            }
        else 
           {
            // Nếu không thì thêm media vào cart và thông báo thêm thành công
            itemOrdered.add(item1);
            itemOrdered.add(item2);
            System.out.println("Both items have been added");
           }
    }
    
    public void removeMedia (Media item)
    {       // Method cho việc loại bỏ media
            if (itemOrdered.isEmpty())
            {   //Nếu list trống thì thông báo cart trống
                System.out.println("The cart is empty");
                return;
            }
            if (itemOrdered.remove(item))
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
        for (Media item : itemOrdered) {
             total += item.getCost();
        }
        // Duyệt tuần tự qua cart và tính tổng cost
        return total;
    }
    
    public void showCart ()
    {   // Method để liệt kê những gì có trong cart và chi phí của chúng
        int i = 1;
        System.out.println("***********************CART***********************");
        for (Media item : itemOrdered) {
             System.out.println(i + ".item - " + item.toString());
             i++;
        // Duyệt lần lượt qua cart và in kết quả
        }
        System.out.print("Total Cost: ");
        System.out.println(totalCost());
        System.out.println("***************************************************");
    }
    
    public Media searchByTitle(String Title)
    { // Method để tìm bằng title
        int count = 1;
        Media result = null;
        for (Media item : itemOrdered) {
            if (item.isMatch(Title))
                {// Duyệt lần lượt qua cart và kiểm tra xem title của dvd có chứa xâu dùng để tra không
                System.out.println(count + ".item -" + item.toString());
                result = item;
                count ++;
                // nếu có thì in ra và tăng count
                }
            
       }
        if (count == 1)
        {   //Nếu count không đổi thì in ra không tìm được
            System.out.println("No results found");
            return null;
            //trả về null khi không tìm thấy
        }
        return result;
        //trả về kết quả cuối
    }
    
    
    public void searchById(int Id)
    {   int count = 1;
        for (Media item : itemOrdered) {
            if (Id == item.getId())
                {// Duyệt tuần tự qua cart và kiểm tra xem id có trùng không
                System.out.println(count + ".item -" + item.toString());
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
    
    public void sortByTitle()
    {
        java.util.Collections.sort(itemOrdered,Media.COMPARE_BY_TITLE_COST);
    }
    
    public void sortByCost()
    {
        java.util.Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}