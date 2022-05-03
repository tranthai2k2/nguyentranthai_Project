import java.util.Scanner;

public class LaoDongPhothong extends nguoi{
    protected int luongthang, songaycong, dongiangaycong, thuong;
    Scanner sc = new Scanner(System.in);

        public void tinhluong(){
            System.out.print( "nhap songaycong: ");
            songaycong =sc.nextInt();
            System.out.print( "nhap dongiangaycong: ");
            dongiangaycong =sc.nextInt();
            if(songaycong <=15) {
                thuong = 0;
            }
            else if(songaycong >15 && songaycong < 25) {
                thuong =700000;
            }
            else if( songaycong >= 25) {
                thuong = 1000000;
            }
            luongthang = songaycong * dongiangaycong + thuong;
            System.out.print( "nhap tien luong thang: " + luongthang);
        }}
    