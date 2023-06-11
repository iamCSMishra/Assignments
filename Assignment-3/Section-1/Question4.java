import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Your Marks:");
    int marks = sc.nextInt();
    sc.close();

    // Condition
    if (marks > 80) {
      System.out.println("You passed with 'A' Grade.");
    }
    if ((marks >= 60) && (marks <= 80)) {
      System.out.println("You passed with 'B' Grade.");
    }
    if ((marks >= 50) && (marks <= 60)) {
      System.out.println("You passed with 'C' Grade.");
    }
    if ((marks >= 45) && (marks <= 50)) {
      System.out.println("You passed with 'D' Grade.");
    }
    if ((marks >= 25) && (marks <= 45)) {
      System.out.println("You passed with 'E' Grade.");
    }
    if (marks < 25) {
      System.out.println("You passed with 'F' Grade.");
    }
  }
}
