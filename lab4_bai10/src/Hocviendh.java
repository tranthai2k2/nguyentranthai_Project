public class Hocviendh extends Hocvien{
        public void hocphi(){
            if(loaict == 1 && loaiuutien == 1){
                hp = sobuoi*dongiadh - 1000000;
                System.out.println("hoc phi : "+ hp);
            }
            else if(loaict == 1 && loaiuutien == 2){
               hp = sobuoi*dongiadh - 500000;
               System.out.println("hoc phi : "+ hp);
            }
        
        }}