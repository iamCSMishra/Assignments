import java.util.Scanner;

public class Question17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Number:");
    int number = sc.nextInt();
    sc.close();

    // Condition
    if (number < 0) {
      System.out.println("Entered number is negative.");
    } else {
      System.out.println("Entered number is positive.");
    }
  }
}