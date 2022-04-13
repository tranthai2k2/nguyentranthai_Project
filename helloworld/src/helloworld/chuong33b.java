package helloworld;
import java.util.Scanner;
class Diem{
    Scanner sc = new Scanner(System.in);
    protected  int hoanh, tung ;
    protected int a;int b;
    protected static int x,y,z,m,n,p;
    public Diem(){
        this.hoanh =0;
        this.tung=0;
    }
   public Diem(int a, int b){
        // int a, int b
        this.hoanh=a;
        this.tung=b;
       
       
        System.out.print("toa do diem : ( "+ a +" , "+ b+" )");
    }
}
class tamgiac extends Diem{
    
   public tamgiac(){
       Diem a1 = new Diem(x,y);
       Diem a2 = new Diem(z, m);
       Diem a3 = new Diem(n, p);
       System.out.println("toa do 3 diem nhap vao A (" + x +" , " + y + ") , B(" + z +" , " + m +") , C ( " + n + " , "+ p +" )");
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
       return cv=pi*r*2;
    }
    public double dientich(){
       return dt=pi*r*r;
    }

}
public class chuong33b {
    public static void main(String[]args){
    Duongtron a = new Duongtron(3, 4, 5);
    System.out.println("dien tich duong tron: "+ a.dientich());
    System.out.println("chuvi duong tron: "+ a.chuvi());
    }
}
