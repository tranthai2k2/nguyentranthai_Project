package helloworld;
import java.util.Scanner;
class SACH{
        Scanner sc = new Scanner(System.in);
        protected String masach , tensach , tentacgia , loaisach, nhaxuatban; 
        protected int sotap, sotrang, gia ;
        SACH(){
            System.out.print("nhap ma sach: ");
             masach = sc.nextLine();
             System.out.print("nhap tensach: ");
             tensach = sc.nextLine(); 
             System.out.print("nhap tentacgia: ");
             tentacgia = sc.nextLine(); 
             System.out.print("nhap sotrang: ");
             sotrang = sc.nextInt(); 
             System.out.print("nhap loaisach: ");
             loaisach = sc.next(); 
             System.out.print("nhap nhaxuatban: ");
             nhaxuatban = sc.next(); ;
             System.out.print("nhap sotap: ");
             sotap = sc.nextInt(); 
             System.out.print("nhap gia: ");
             gia = sc.nextInt(); 
        }
    }
    
    class insach extends SACH{
        
        public void intt() {
            
            System.out.println("thong tin: " + masach + " - " + tensach + " - " + tentacgia + " - " +sotrang + " - " + loaisach + " - " + nhaxuatban +" - " + sotap +" : gia ban "+ gia );
        }
    }
public class chuong33 {
    
public static void main(String[]args){
    insach s = new insach();
    s.intt();
   
}
}
