package helloworld;
import java.util.Scanner;
class Diem{
    Scanner sc = new Scanner(System.in);
    protected  int hoanh, tung ;
    protected static int x,y,z,m,n,p;
    public Diem(){
        this.hoanh =0;
        this.tung=0;
    }
   public Diem(int a, int b){
        // int a, int b
        this.hoanh=a;
        this.tung=b;
        System.out.print("nhap hoanh do x:");
        a=sc.nextInt();
        System.out.print("nhap tung do y:");
        b=sc.nextInt();
       
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

public class chuong33b {
    public static void main(String[]args){
     tamgiac a = new tamgiac();
    }
}
