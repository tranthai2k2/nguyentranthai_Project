package helloworld;
import java.util.Scanner;
public class bai9 {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi: " );
        String text = sc.nextLine();
        // System.out.println(text.length());
        // độ dài
        // System.out.println(text.charAt(0)); in ra ký tự vị trị 0
        // ký tự đầu tiên luôn bắt đầu từ 0
        int thuong,hoa,so,cach;
        thuong=hoa=so=cach=0;
        for(int i =0; i<text.length(); i++){
            if((text.charAt(i)>= 'a') && (text.charAt(i)<='z')){
                thuong ++;
              }
              else if((text.charAt(i)>= 'A') && (text.charAt(i)<='Z')){
               hoa ++;
              }
              else if((text.charAt(i)>= '0') && (text.charAt(i)<='9')){
                so++;
              } else{
                  cach++;
              }
            
        }
        System.out.println("chu thuong: "+ thuong);
        System.out.println("chu hoa: "+ hoa );
        System.out.println("chu so: "+ so);
        System.out.println("khoang cach: "+ cach);
}
}