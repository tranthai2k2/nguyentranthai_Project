import java.util.Scanner;

public class GVThinhGiang extends giangvien{
    protected double luongthang, dongia;
    protected int tietday;
    Scanner sc = new Scanner(System.in);

        public void tinhluong(){
            System.out.print( "nhap tietday: ");
            tietday =sc.nextInt();
            System.out.print( "nhap dongia: ");     
             dongia =sc.nextDouble();
             luongthang = (double) tietday * dongia + ((double) 15/100 * (tietday * dongia));
             System.out.println("luong thang:" + luongthang);
        }}
    