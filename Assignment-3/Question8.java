import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter any number:");
    int number = sc.nextInt();
    sc.close();

    // condition
    if (number % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }
  }
}