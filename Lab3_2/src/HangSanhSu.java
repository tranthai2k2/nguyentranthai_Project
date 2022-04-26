import java.util.Scanner;
public class HangSanhSu {
    Scanner sc = new Scanner(System.in);

    protected String loainguyenlieu;
    int a;
    HangSanhSu(){
        System.out.print("loai hang : " );
        loainguyenlieu = sc.nextLine();
        
    }
    public void  inlH(){
        System.out.print("loai hang su dung: " + loainguyenlieu + "\n" );
        
    }
    public static void main(String[] args) throws Exception {
        HangSanhSu a = new HangSanhSu();
        a.inlH();
     }
}
