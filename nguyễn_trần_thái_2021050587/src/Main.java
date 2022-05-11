
public class Main {
 
    public static void main(String[] args) {
      Tour a = new Tour();
      a.SetTour();
      a.getTour();
      System.out.print("daylathue: day la bai cua tran thai" +   a.getTax()); 
      NoTaxTour b = new NoTaxTour();
      b.SetTour();
      b.getTour();
     System.out.print("cuatranthaithue: day la bai cua tran thai " +   b.getTax()); 
    }
 
}
