package helloworld;
import java.util.Scanner;
public class bai12 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("nhap vao n: " );
        n = sc.nextInt();
        System.out.print("nhap vao m: " );
        m = sc.nextInt();
        if(n==0 || m ==0){
            System.out.print("thành mảng 1 chiều");
    
        }
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
               
            }
            System.out.print("\n");
        }
        int max = a[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(max<a[i][j]){
                    max = a[i][j];
                }
            }
        }
        System.out.println("gia tri ln: "+ max);


    }
}
