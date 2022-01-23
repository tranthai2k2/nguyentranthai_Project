package helloworld;
import java.util.Scanner;
public class bai3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Mời bạn nhập vào tên: ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập vào tu: ");
        int age = sc.nextInt();
        if(age<16){
            System.out.println("Bạn"+ name + "ởđộtuổivịthànhniên");
        } else if(age>=16 && age <18){
            System.out.println("Bạn"+ name + "ởđộtuổitrưởngthành");
        }
        else if(age>=16 && age <18){
            System.out.println("Bạn"+ name + "đãgià");
        }
}
}
