import java.util.Scanner;

public abstract class nguoi {
    protected String hoten, diachi ,ngaysinh ;
    protected int loaiuutien, loaict ;
   
     Scanner sc = new Scanner(System.in);
     public void nhapthongtin(){
      System.out.print("nhap ho ten: ");
      hoten = sc.nextLine();
      System.out.print("nhap dia chi: ");
      diachi = sc.nextLine();
    
  
     
      do{
          System.out.print("chọn loai giang vien 1 Lao động phổ thông  or 2 kĩ sư:");
          loaict = sc.nextInt();
          if(loaict >2 && loaict < 1){
              System.out.print("nhap lai gia tri!");
          }
          
      }while(loaict<1 && loaict >2);
     }
     public abstract void tinhluong();
     public void inthongtin(){
         System.out.println("ho ten: "+ hoten);
         System.out.println("diachi "+ diachi);
         
         
          switch ( loaict ) {
              case  1:
              System.out.println("loai Lao động phổ thông");
              break;
              case  2:
              System.out.println("loai kĩ sư");
                  break;
          }
          
     }
  
  }
  
  
