package helloworld;
import java.util.Scanner;
public class bai4 {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao thang: " );
		int n = sc.nextInt();
        switch (n){

            case 1:
                System.out.println("Đây là số thang 1");
                break;
            case 2:
            System.out.println("Đây là số thang 2");
                break;
            case 3:
            System.out.println("Đây là số thang 3");
                break;
            case 4:System.out.println("Đây là số thang 4");
                break;
            case 5:
            System.out.println("Đây là số thang 5");
                break;
            case 6:
            System.out.println("Đây là số thang 6");
                break;
            case 7:
                System.out.println("Đây là số thang 7");
                    break;
            case 8:
            System.out.println("Đây là số thang 8");
                break;
            case 9:
            System.out.println("Đây là số thang 9");
                break;
            case 10:
                System.out.println("Đây là số thang 10");
                    break;
            case 11:
            System.out.println("Đây là số thang 11");
            break;
            case 12:
                System.out.println("Đây là số thang 12");
                  break;
            default:
                System.out.println("ko co thang nay");
                break;
        }
        
    }
}
