//Nguyen Van Cuong - 20215006
//Application 5: SortNumericArray.java
import java.util.Scanner;
public class SortNumericArray {
    // sắp xếp mảng
    public static void arrange(int a[], int n){
        for (int i=0;i<n;i++)
            for(int j=i;j<n;j++)
                if(a[i]>a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
        System.out.print("Mang da duoc xep tu nho toi lon la: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");
    }
    // in ra tổng và trung bình
    public static void SumEndAverage(int a[], int n){
        long sum=0;
        for (int i=0;i<n;i++) sum+=a[i];
        System.out.print("Tong cua mang la: " + sum + "\nTrung binh cua mang la: " + sum/n);
        System.out.println("\n");
    }
    // in mảng
    public static void Printarray(int a[], int n){
        System.out.println("Mang ban vua nhap la: ");
        for (int i=0;i<n;i++) System.out.print(a[i]+", ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a=new int[100] ;
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        Printarray(a,n);
        arrange(a, n);
        SumEndAverage(a,n);
    }

}