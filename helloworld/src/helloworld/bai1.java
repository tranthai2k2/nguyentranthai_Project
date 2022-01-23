package helloworld;
import java.util.Scanner;
public class bai1 {
	public static void main(String[]args) {
		System.out.println("bai 1");
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao so a: " );
		int a = sc.nextInt();
		System.out.print("nhap vao so b: " );
		int b = sc.nextInt();
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("so sánh 2 so a và b:");
		if(a==b){System.out.print("a==b");}
        else if(a<=b){System.out.print("a<=b");}
		else if(a>=b){System.out.print("a>=b");}
	}
}