import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter Number");
    int number = sc.nextInt();
    sc.close();

    // Condition
    if (number < 0) {
      System.out.println("Negative Number");
    } else {
      System.out.println("Positive Number");
    }
  }
}