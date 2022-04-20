package helloworld;
import java.util.Scanner;
class Diem{
    
    protected  int hoanh, tung ;
    public Diem(){
        Scanner sc = new Scanner(System.in);
        // int a, int b
        this.hoanh=hoanh;
        this.tung=tung;
        System.out.println("nhập hoanh do:");
       hoanh = sc.nextInt();
       System.out.println("nhập tung do:");
       tung = sc.nextInt();
    }
   public Diem(int hoanh, int tung){
    this.hoanh =hoanh;
    this.tung =tung;
    }
    public void InDiem(){
        System.out.print("toa do diem : ( "+this.hoanh +" , "+ this.tung+" )");
    }
}

class tamgiac extends Diem{
    private Diem A,B,C;
 
    tamgiac(){
        System.out.println("da nhap toa do diem t1\n");
        A = new Diem();
        System.out.println("da nhap toa do diem t2\n");
        B = new Diem();
        System.out.println("da nhap toa do diem t3\n");
        C = new Diem();
    }
    public void Intamgiac(){
       System.out.println("in toa do 3 diem ");
       System.out.print("diem a: "); A.InDiem();
       System.out.print("\ndiem b: "); B.InDiem();
       System.out.print("\ndiem c: "); C.InDiem();
    }
    public  void kiemtratamgiac()
    {
        if(A.hoanh == B.hoanh && A.hoanh == C.hoanh ){
            if(A.tung == B.tung && A.tung == C.tung)
           System.out.println("\nkhong la tam giac");
           else   System.out.println("\nla tam giac");
        } 
    }
    public double dientichtamgiac(){
        return (double) 1/2 * Math.abs(  (B.hoanh - A.hoanh ) * (C.tung - A.tung) - (C.hoanh - A.hoanh)*(B.tung - A.tung)  );
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
    ABC.kiemtratamgiac();
    }
}
