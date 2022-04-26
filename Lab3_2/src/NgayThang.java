
import java.util.Scanner;
public class NgayThang {
    Scanner sc = new Scanner(System.in);
    int ngay,thang, nam;
    NgayThang(){
        // xay dựng hoàn chỉnh nhập ngày tháng năm hơi lâu nên chỉ xây dựng nhập nên có thể ngày tháng ko đúng
        System.out.print("nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("nhap thang: ");
        thang = sc.nextInt();
        System.out.print("nhap nam: ");
        nam = sc.nextInt();
    }
    NgayThang(int ngay, int thang, int nam){
        this.ngay= ngay;
        this.thang=thang;
        this.nam=nam;
    }
    public void inNT(){
        System.out.print("ngay/thang/nam: " + ngay + " / " + thang + " / " + nam + "\n");
    }


    public static void main(String[] args) throws Exception {
       NgayThang a = new NgayThang();
       a.inNT();
    }
}
