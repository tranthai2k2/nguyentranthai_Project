import java.util.Scanner;

public class Hocvienlt extends Hocvien{
    protected int dongiadh,hp,sobuoi;
    Scanner sc = new Scanner(System.in);
        public void hocphi(){
            System.out.print("nhap sobuoi: ");
            sobuoi = sc.nextInt();
            System.out.print("nhap dongiadh: ");
            dongiadh = sc.nextInt();
            if(loaict == 2 && loaiuutien == 1){
                hp = sobuoi*dongiadh - 1000000;
                System.out.println("hoc phi : "+ hp);
            }
          else if(loaict == 2 && loaiuutien == 2){
               hp = sobuoi*dongiadh - 500000;
               System.out.println("hoc phi : "+ hp);
            }
        }}
    