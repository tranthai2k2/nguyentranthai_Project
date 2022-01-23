package helloworld;
import java.util.Scanner;
public class bai2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so n: " );
		int n = sc.nextInt();
    if(n%2==0)
    {
        System.out.println("Đây là số chẵn!");
    }
    else
    {
        System.out.println("Đây là số lẻ!");
    }
}
}