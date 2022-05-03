import java.util.Scanner;
public class Kisu extends nguoi{
    protected int luongthang,luongcoban, hesoluong, thuong,songaycong;
    Scanner sc = new Scanner(System.in);

        public void tinhluong(){
            System.out.print( "nhap luongcoban: ");
            luongcoban =sc.nextInt();
            System.out.print( "nhap hesoluong: ");
            hesoluong =sc.nextInt();
            System.out.print( "nhap songaycong: ");
          songaycong =sc.nextInt();
            if(songaycong <=15) {
                thuong = 500000;
            }
            else if(songaycong >15 && songaycong < 25) {
                thuong =1000000;
            }
            else if( songaycong >= 25) {
                thuong = 2000000;
            }
            luongthang = luongcoban*hesoluong*thuong;
            System.out.print( "nhap tien luong thang: " + luongthang);
        }}
