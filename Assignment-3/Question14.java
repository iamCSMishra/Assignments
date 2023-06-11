import java.util.Scanner;

public class Question14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st Number:");
    int numberOne = sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int numberTwo = sc.nextInt();
    System.out.println("Enter 3rd Number:");
    int numberThree = sc.nextInt();
    System.out.println("Enter 4th Number:");
    int numberFour = sc.nextInt();
    sc.close();

    // Condition
    if ((numberOne < numberTwo) && (numberOne < numberThree) && (numberOne < numberFour)) {
      System.out.println("Lowest number is " + numberOne);
    } else if ((numberTwo < numberOne) && (numberTwo < numberThree) && (numberTwo < numberFour)) {
      System.out.println("Lowest number is " + numberTwo);
    } else if ((numberThree < numberOne) && (numberThree < numberTwo) && (numberThree < numberFour)) {
      System.out.println("Lowest number is " + numberThree);
    } else {
      System.out.println("Lowest number is " + numberFour);
    }
  }
}