import java.util.Scanner;

public class Question11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter Number:");
    int number = sc.nextInt();
    sc.close();

    // Condition
    switch (number % 2) {
      case 0:
        System.out.println("Even Number!");
        break;
      case 1:
        System.out.println("Odd Number!");
        break;
    }
  }
}