import java.util.Scanner;

public class Question15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Cost Price:");
    int price = sc.nextInt();
    sc.close();
    float roadTax = 0;

    // condition
    if (price > 100000) {
      roadTax = ((price * 15) / 100f);
    } else if ((price > 50000) && (price <= 100000)) {
      roadTax = ((price * 10) / 100f);
    } else if (price <= 50000) {
      roadTax = ((price * 5) / 100f);
    }

    // Output
    System.out.println("Road Tax: " + roadTax);
  }
}