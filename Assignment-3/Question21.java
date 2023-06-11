import java.util.Scanner;

public class Question21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st angle:");
    int angleA = sc.nextInt();
    System.out.println("Enter 2nd angle:");
    int angleB = sc.nextInt();
    System.out.println("Enter 3rd angle:");
    int angleC = sc.nextInt();
    sc.close();
    int sumOfAngles = (angleA + angleB + angleC);

    // Condition
    if (sumOfAngles == 180) {
      System.out.println("Valid Triangle!");
    } else {
      System.out.println("Invalid Triangle!");
    }
  }
}