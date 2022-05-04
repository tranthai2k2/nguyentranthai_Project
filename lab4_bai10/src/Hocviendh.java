import java.util.Scanner;

public class Hocviendh extends Hocvien{
    protected int dongiadh,hp, sobuoi;
    Scanner sc = new Scanner(System.in);
    
        public void hocphi(){
            System.out.print("nhap sobuoi: ");
            sobuoi = sc.nextInt();
            System.out.print("nhap dongiadh: ");
             dongiadh = sc.nextInt();
             System.out.println(loaict);
             System.out.println(loaiuutien);
            if(loaict == 1 && loaiuutien == 1){
                hp = sobuoi * dongiadh - 1000000;
                System.out.println("hoc phi : "+ hp);
            }
            else if(loaict == 1 && loaiuutien == 2){
               hp = sobuoi*dongiadh - 500000;
               System.out.println("hoc phi : "+ hp);
            }
        
        }}