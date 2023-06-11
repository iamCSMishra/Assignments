import java.util.Scanner;

public class Question22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Number!");
    int number = sc.nextInt();
    sc.close();

    // Condition
    if ((number % 5 == 0) && (number % 11 == 0)) {
      System.out.println(number + " is divisible by 5 and 11.");
    } else {
      System.out.println(number + " is not divisible by 5 and 11.");
    }
  }
}