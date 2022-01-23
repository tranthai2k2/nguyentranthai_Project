package helloworld;
import java.util.Scanner;
public class bai5 {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
       int tong;
        do{
            System.out.print("nhap vao n: " );
            int n = sc.nextInt();
            System.out.print("nhap vao m: " );
            int m = sc.nextInt();
            tong = m+n;
            if(tong <100) { System.out.println("tong nay <100");}
           else if(tong >=100) { System.out.println("tong nay >=100");}
            
        }while(tong<100);
}}
