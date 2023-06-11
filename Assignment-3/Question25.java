import java.util.Scanner;

public class Question25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Buying Price:");
    int buyingPrice = sc.nextInt();
    System.out.println("Enter Selling Price:");
    int sellingPrice = sc.nextInt();
    sc.close();
    int profitOrLoss = sellingPrice - buyingPrice;

    // Condition
    if (profitOrLoss > 0) {
      System.out.println("You Earn Profit.");
    } else if (profitOrLoss < 0) {
      System.out.println("You Have Loss.");
    } else {
      System.out.println("No Profit No Loss.");
    }
  }
}