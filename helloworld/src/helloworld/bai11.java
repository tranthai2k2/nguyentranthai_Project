package helloworld;
import java.util.Scanner;
public class bai11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.print("nhap vao so pt: " );
         n = sc.nextInt();
        if(n<100){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("nhap pt a["+ (i+1)+"]:");
                a[i] = sc.nextInt();
            }
            System.out.print("mang nhap vao:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
            int tg;
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    if(a[i] > a[j]){
                        // Hoan vi 2 so a[i] va a[j]
                        tg = a[i];
                        a[i] = a[j];
                        a[j] = tg;        
                    }
                }
            }
            System.out.println(" \n sắp xếp lại mảng theo thứ tự tăng dần:");
            for(int i = 0; i < n; i++){
               System.out.printf("%5d", a[i]);
            }
         
        } else {
            System.out.println("nhap lai n!!!");
        }
        }while(n>100);
        
        
        




     }
}
