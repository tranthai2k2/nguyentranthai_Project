package helloworld;
import java.util.Scanner;
public class bai8 {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao n: " );
        int n =sc.nextInt();
        int sum =0;
        int m;
        for(int i=1;i<=n;i++){
            System.out.println("nhap vao so nguyen: ");
            m=sc.nextInt();
            sum +=m;
    
        }

       
        System.out.println("trung bình cộng: "+ (float)(1.0*sum/n));
}

}
