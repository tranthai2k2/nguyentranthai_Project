package helloworld;
import java.util.Scanner;
class thisinh{
    Scanner sc = new Scanner(System.in);
    protected String ten ; 
    protected double toan, van, anh;
    int a;
    int b[] = null;
    thisinh(String ten ,Double  toan,Double van, Double anh){
        this.ten=ten;
        this.toan =toan;
        this.van =van;
        this.anh =anh;
    }
    thisinh(){
            System.out.print("nhap ten: ");
            ten = sc.nextLine();
            System.out.print("nhap diem toan: ");
            toan = sc.nextDouble();
            System.out.print("nhap diem van: ");
            van= sc.nextDouble();
            System.out.print("nhap diem anh: ");
            anh = sc.nextDouble();
    }
  
    public double tongdiem3mon(){
        return toan + van + anh;
    }
    public void hienthitt(){
        System.out.print("hien thi: "+ ten +" diem toan : "+ toan +" diem van: "+ van +" diem anh: "+ anh +" tong diem: "+ tongdiem3mon() + "\n");
    }
    public void nhapperson(){
        thisinh b[];
            do{
            System.out.print("nhap so nguoi: ");
            a = sc.nextInt();
         if(a<=0){
            System.out.print("nhap sai yeu cau nhap lai! ");
         }
        }while(a<=0);
        b = new thisinh[a];
       for(int i=0; i<a;i++){
        System.out.print("nhap nguoi t" + (i+1)+" : ");
          b[i] = new thisinh();
       }
//         bai nay được làm bởi nguyễn trần thái : 2021050587
       for(int i=0; i<a;i++){
        System.out.print("nhap nguoi t" + (i+1)+" : ");
          b[i].hienthitt();
       }
      
       for(int i=0; i<a;i++){
        if(b[i].tongdiem3mon()>=20){
            System.out.print( b[i].ten);
           
        }
        }
    }
}
public class lab3v1b2 {
    public static void main(String[]args) {
    thisinh a = new thisinh();
    a.nhapperson();
    }
}
