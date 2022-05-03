import java.util.Scanner;
public class GVCoHuu extends giangvien{
    protected double luongthang, luongcoban, phucap, hesoluong;
    private int thamnien;
    Scanner sc = new Scanner(System.in);

    public void tinhluong(){
        System.out.print( "nhap luongcoban: ");
        luongcoban =sc.nextDouble();
        System.out.print( "nhap hesoluong: ");
        hesoluong =sc.nextDouble();

            do{
                System.out.print( "nhap thamnien: ");
        thamnien =sc.nextInt();
        if( 0 > thamnien || thamnien >60){
            System.out.println("nhap lai tham nien!");
        }
    } while( 0 > thamnien || thamnien > 60 );
    if(thamnien < 5 && thamnien>0){
       luongthang = luongcoban * hesoluong + ( 0/100 * luongcoban);
        System.out.println("luong thang:" + luongthang);
    } else {
        luongthang = luongcoban * hesoluong + ( (double) thamnien/100 * luongcoban);
        System.out.println("luong thang:" + luongthang);
    }

    }
}
