import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter value:");
    int value = sc.nextInt();
    sc.close();

    // Condition
    if (value < 0) {
      value = (value * -1);
    }

    // Output
    System.out.println("Value is: " + value);
  }
}