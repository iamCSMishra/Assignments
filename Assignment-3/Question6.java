import java.util.Scanner;

public class Question6 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Number One: ");
    int numberOne = sc.nextInt();
    System.out.println("Enter Number Two: ");
    int numberTwo = sc.nextInt();
    sc.close();

    // Condition
    if (numberOne > numberTwo) {
      System.out.println(numberOne + " is greater then " + numberTwo);
    } else {
      System.out.println(numberTwo + " is greater then " + numberOne);
    }
  }
}