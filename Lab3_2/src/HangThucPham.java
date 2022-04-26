public class HangThucPham {
  private NgayThang ngaysanxuat, ngayhethan;
  HangThucPham(){
    System.out.println("ngay san xuat : " );
      this.ngaysanxuat = new NgayThang();
      System.out.println("ngay het han : " );
      this.ngayhethan = new NgayThang();
  }
  public void tgsd(){
    System.out.print("thoi gian su dung: " );
    ngaysanxuat.inNT();
    System.out.print(" to " );
    ngayhethan.inNT();

  }
  public static void main(String[] args) throws Exception {
      HangThucPham a = new HangThucPham();
      a.tgsd();
  }

}
