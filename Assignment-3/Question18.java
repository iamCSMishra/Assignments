import java.util.Scanner;

public class Question18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Number:");
    int number = sc.nextInt();
    sc.close();

    // condition
    if ((number / 2) * 2 == number) {
      System.out.println("Even Number!");
    } else if ((number / 2) * 2 != number) {
      System.out.println("Odd Number!");
    } else {
      System.out.println("Invalid input!");
    }
  }
}