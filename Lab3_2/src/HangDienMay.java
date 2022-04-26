import java.util.Scanner;

public class HangDienMay {
    protected String thoigianbaohanh;
    double dienap,congsuat;
    Scanner sc = new Scanner(System.in);
    HangDienMay(){
        System.out.print("thoi gian bao hanh : " );
        thoigianbaohanh = sc.nextLine();
        System.out.print("dien ap: " );
        dienap = sc.nextDouble();
        System.out.print("cong suat: " );
        congsuat = sc.nextDouble();
    }
    HangDienMay(String thoigianbaohanh, double dienap, double congsuat)
    {
        this.thoigianbaohanh = thoigianbaohanh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }
    public void intTThangdienmay(){
        System.out.print("thoi gian bao hanh : " + thoigianbaohanh + " |  dien ap: " + dienap +" | cong suat: " + congsuat + "\n" );
    }
    public static void main(String[] args) throws Exception {
        HangDienMay a = new HangDienMay();
        a.intTThangdienmay();
     }
}
