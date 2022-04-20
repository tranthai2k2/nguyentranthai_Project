package helloworld;
import java.util.Scanner;
class Diem{
    
    protected  int hoanh, tung ;
    public Diem(){
        this.hoanh =0;
        this.tung=0;
    }
   public Diem(int hoanh, int tung){
    Scanner sc = new Scanner(System.in);
        // int a, int b
        this.hoanh=hoanh;
        this.tung=tung;
        System.out.println("nhập hoanh do:");
       hoanh = sc.nextInt();
       System.out.println("nhập tung do:");
       tung = sc.nextInt();
    }
    public void InDiem(){
        System.out.print("toa do diem : ( "+this.hoanh +" , "+ this.tung+" )");
    }
}

class tamgiac extends Diem{
    private Diem A,B,C;
 
    tamgiac(){
        A = new Diem();
        B = new Diem();
        C = new Diem();
    }
    public void Intamgiac(){
       System.out.println("in toa do 3 diem ");
       System.out.print("diem a: "); A.InDiem();
       System.out.print("\ndiem b: "); B.InDiem();
       System.out.print("\ndiem c: "); C.InDiem();
    }
}
class Duongtron  extends Diem{
    protected  int r;
    protected double pi=3.14;
    protected double cv, dt;
    public Duongtron(int a, int b,int r){
        super(a,b);
        this.r=r;

        System.out.print("\nnhap ban kinh r: "+ r);
        System.out.println("");
      
    }
    public double chuvi(){
       return (double) pi*r*2;
    }
    public double dientich(){
       return (double) pi*r*r;
    }

}
public class chuong33b {
    public static void main(String[]args){
    // Duongtron a = new Duongtron(3, 4, 5);
    // System.out.println("dien tich duong tron: "+ a.dientich());
    // System.out.println("toa do tam: " ); a.InDiem();
    // System.out.println("chuvi duong tron: "+ a.chuvi());
    tamgiac ABC = new tamgiac();
    ABC.Intamgiac();
    }
}
