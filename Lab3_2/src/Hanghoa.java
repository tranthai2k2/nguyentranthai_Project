import java.util.Scanner;

public class Hanghoa {
    Scanner sc = new Scanner(System.in);
    String mahang,tenhang,Nhasanxuat;
    int gia;
    private HangThucPham HTp;
    private HangSanhSu Hss;
    private HangDienMay Hdm;
    public void Nhap(){
     HTp =  new HangThucPham();
     System.out.println("---------------------");
     Hss = new HangSanhSu();
     System.out.println("---------------------");
     Hdm = new HangDienMay(); 
     System.out.println("---------------------");
     System.out.print("nhap ma hang : " );
     mahang = sc.nextLine();
     System.out.print("nhap tenhang : " );
     tenhang = sc.nextLine();
     System.out.print("nhap Nhasanxuat : " );
    Nhasanxuat= sc.nextLine();
    System.out.print("nhap gia : " );
    gia =sc.nextInt();

    }
    public void intthanghoa(){
     System.out.println("---------------------");    
    HTp.tgsd();
    System.out.println("---------------------");
    Hss.inlH();
    System.out.println("---------------------");
    Hdm.intTThangdienmay();
    System.out.println("---------------------");
    System.out.print("ma hang : " + mahang + " |  nhap tenhang :  " + tenhang +" | Nhasanxuat : " + Nhasanxuat +" | Nhasanxuat : "+ Nhasanxuat + "\n" );
    System.out.println("---------------------");
    }
        public static void main(String[] args) throws Exception {
            Hanghoa a = new Hanghoa();
            a.Nhap();
            a.intthanghoa();
         }
    }
