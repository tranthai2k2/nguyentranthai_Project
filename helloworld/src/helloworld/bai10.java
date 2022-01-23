package helloworld;
import java.util.Scanner;
public class bai10 {
    public static void main(String[]args) { 
     
        Scanner sc = new Scanner(System.in);
        String text;
        int solan=0;
        do{
            System.out.print("nhap vao chuoi: " );
            text = sc.nextLine();
            if(text.length()>80){          
                  System.out.println("nhap lai chuoi!" );
        }
        }while(text.length()>80);
        System.out.print("nhap vao kt: " );
        char kt;
        String ktd;
       
        do{
            ktd=sc.nextLine();
           if(ktd.length()==1) {kt = ktd.charAt(0);
            for(int i=0; i<text.length();i++){
                // System.out.println();
                if(kt==text.charAt(i)) {
                 solan++;
                }
            }}
            else System.out.print("nhap lại kt: " );
        }while(ktd.length()>1);
        
       
        System.out.println("so lan xuat hien:"+ solan);
}}
