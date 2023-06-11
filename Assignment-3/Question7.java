import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter 1st Number:");
    int numberOne = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int numberTwo = sc.nextInt();
    System.out.println("Enter 3rd Number:");
    int numberThree = sc.nextInt();
    sc.close();

    // Condition
    if ((numberOne > numberTwo) && (numberOne > numberThree)) {
      System.out.println("Number one is greater:");
    } else if ((numberTwo > numberThree) && (numberTwo > numberOne)) {
      System.out.println("Number Two is greater:");
    } else {
      System.out.println("Number Three is greater:");
    }
  }
}