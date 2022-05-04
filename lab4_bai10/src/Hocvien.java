import java.util.Scanner;

public abstract class Hocvien {
    protected String hoten, diachi ;
    protected int loaiuutien, loaict ;
    //  protected int dongiadh,hp;
  //    a =1 thì là loại 1 nếu a =2 thì là loại 2
  //    Đồ họa:   học phí = số buổi*đơngiá ĐH –ưu tiênTrong đó: ưu tiên = 1.000.000 (VNĐ) nếu là loại 1ưu tiên = 500.000 (VNĐ) nếu là loại 2+
  //    Lập trình:  học phí = số buổi*đơn giá LT –ưu tiênTrong đó: ưu tiên = 1.000.000 (VNĐ) nếu là loại 1ưu tiên = 800.000 (VNĐ) nếu là loại 2
     Scanner sc = new Scanner(System.in);
     public void nhapthongtin(){
      System.out.print("nhap ho ten: ");
      hoten = sc.nextLine();
      System.out.print("nhap dia chi: ");
      diachi = sc.nextLine();
    //   System.out.print("nhap dongiadh: ");
    //   dongiadh = sc.nextInt();
     
      do{
          System.out.print("chọn loai chuong trinh 1 dohoa  hoặc 2 lập trình:");
          loaict = sc.nextInt();
          if(loaict >2 && loaict < 1){
              System.out.print("nhap lai gia tri!");
          }
          
      }while(loaict<1 && loaict >2);
      do{
          System.out.print("chọn loai uu tien 1 hoac 2:");
          loaiuutien = sc.nextInt();
          if(loaiuutien >2 && loaiuutien < 1){
              System.out.print("nhap lai gia tri!");
          }
          
      }while(loaict<1 && loaict >2);
     }
     public abstract void hocphi();
     public void inthongtin(){
         System.out.println("ho ten: "+ hoten);
         System.out.println("diachi "+ diachi);
         switch ( loaiuutien ) {
              case  1:
              System.out.println(" uu tien loai 1");
              break;
              case  2:
              System.out.println(" uu tien loai 2");
                  break;
          }
          switch ( loaict ) {
              case  1:
              System.out.println("loai chuong trinh da chon do hoa");
              break;
              case  2:
              System.out.println("loai chuong trinh da chon lap trinh");
                  break;
          }
          
     }
  
  }
  
  
