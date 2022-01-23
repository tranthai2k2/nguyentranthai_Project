package helloworld;
import java.util.Scanner;
public class bai6 {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao n: " );
        int n = sc.nextInt();
       int tong=1;
       int i=1;
       while ( i <= n) {
		tong *= i;      
		++i;
	}
        System.out.print("giai thua cua n: " + tong);
}}
