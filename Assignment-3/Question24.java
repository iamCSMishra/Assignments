import java.util.Scanner;

public class Question24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Amount: ");
    int amount = sc.nextInt();
    sc.close();

    // Note of 500
    int fiveHundredRupees = (amount / 500);
    System.out.println("Number of Rs.500 " + fiveHundredRupees);

    // Note of 100
    int oneHundredRupees = ((amount - (fiveHundredRupees * 500)) / 100);
    System.out.println("Number of Rs.100 " + oneHundredRupees);

    // Note of 50
    int fiftyRupees = ((amount - ((fiveHundredRupees * 500) + (oneHundredRupees * 100))) / 50);
    System.out.println("Number of Rs.50 " + fiftyRupees);

    // Note of 10
    int tenRupees = ((amount - ((fiveHundredRupees * 500) + (oneHundredRupees * 100) + (fiftyRupees * 50))) / 10);
    System.out.println("Number of Rs.10 " + tenRupees);
  }
}