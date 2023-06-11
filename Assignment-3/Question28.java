import java.util.Scanner;

public class Question28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter consumed unit: ");
    int consumedUnit = sc.nextInt();
    sc.close();
    double payableBill = 0;
    double surcharge = 0;

    // Condition
    if (consumedUnit <= 50) {
      payableBill = (consumedUnit * 0.50);
    } else if (consumedUnit <= 150) {
      payableBill = 50 * 0.50 + (consumedUnit - 50) * 0.75;
    } else if (consumedUnit <= 250) {
      payableBill = 50 * 0.50 + 100 * 0.75 + (consumedUnit - 150) * 1.20;
    } else if (consumedUnit > 250) {
      payableBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (consumedUnit - 250) * 1.50;
      surcharge = ((payableBill * 20) / 100);
    }

    // Output
    System.out.println("The electricity bill for " + consumedUnit + " is : " + (payableBill + surcharge));
  }
}