import java.util.Scanner;
   

public class Tour {
    private String title;
   private double price;
    protected double name;
    Scanner sc = new Scanner(System.in);
    public double getTax(){
       return 0.5/100 *price;
    }
    // day la bai cua tran thai
    public void SetTour () {
        System.out.print("daylacuatranthainhap tên tour du lịch: ");
        title =sc.nextLine();
     System.out.print("nhap gia: ");
     price =sc.nextDouble();
    }
   public void getTour () {
    System.out.println("ten tour du lich: "+ title);
    System.out.println("ten gia: "+ price);
      this.name="nguyentranthai";
   }
    public static void main(String[] args) throws Exception {
        Tour a = new Tour();
        a.SetTour();
        a.getTour();
        System.out.print("thue: day la bai cua tran thai" +   a.getTax()); 
     }
}
