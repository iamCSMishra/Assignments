import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st Number:");
    int numberOne = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int numberTwo = sc.nextInt();
    sc.close();

    // Calculation
    numberOne = numberOne ^ numberTwo;
    numberTwo = numberOne ^ numberTwo;
    numberOne = numberOne ^ numberTwo;

    // Output
    System.out.println("After swapping: " + "\n" + "Number One: " + numberOne + "\n" + "Number Two: " + numberTwo);
  }
}