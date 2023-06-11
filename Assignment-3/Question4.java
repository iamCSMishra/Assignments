import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Value One:");
    int valueOne = sc.nextInt();
    System.out.println("Enter Value Two:");
    int valueTwo = sc.nextInt();
    sc.close();
    int valueThree = 0;

    // Condition
    valueThree = valueOne;
    valueOne = valueTwo;
    valueTwo = valueThree;

    // Output
    System.out.println("After swapping (Using third variable): " + "\n" + "Number One: " + valueOne + "\n"
        + "Number Two: " + valueTwo);

    // Value Reset
    valueOne = 10;
    valueTwo = 20;

    // Condition
    valueOne = valueOne + valueTwo;
    valueTwo = valueOne - valueTwo;
    valueOne = valueOne - valueTwo;

    // Output
    System.out.println("After swapping (Without using third variable): " + "\n" + "Number One: " + valueOne + "\n"
        + "Number Two: " + valueTwo);
  }
}