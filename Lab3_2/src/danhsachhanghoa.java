import java.util.Scanner;
public class danhsachhanghoa {
    Scanner sc = new Scanner(System.in);
    int a;
    int b[] = null;
    public void nhaphanghoa(){
         Hanghoa b[];
            do{
            System.out.print("nhap so luong hang hoa: ");
            a = sc.nextInt();
         if(a<=0){
            System.out.print("nhap sai yeu cau nhap lai! ko được <=0 ");
         }
        }while(a<=0);
        b = new Hanghoa[a];
       for(int i=0; i<a;i++){
        System.out.print("hang hoa t" + (i+1)+" : ");
          b[i] = new Hanghoa();
       }
       
    }
    public void indanhsachhanghoa(){
        int b[] = null;
        Hanghoa b[];
        b =  Hanghoa[a];
        for(int i=0; i<a;i++){
            System.out.print("hang hoa t" + (i+1)+" : ");
              b[i].intthanghoa();;
           }
    }
    public static void main(String[] args) throws Exception {
        Hanghoa a = new Hanghoa();
        
     }
}
