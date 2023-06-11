import java.util.Scanner;

public class Question29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st number:");
    int numberOne = sc.nextInt();
    System.out.println("Enter 2nd number:");
    int numberTwo = sc.nextInt();
    System.out.println("Operation: '+' '>' '='");
    char operation = sc.next().charAt(0);
    sc.close();

    // condition
    if (operation == '+') {
      System.out.println("Addition of " + numberOne + " and " + numberTwo + " is " + (numberOne + numberTwo));
    } else if (operation == '>') {
      if (numberOne > numberTwo) {
        System.out.println(numberOne + " number is greatest.");
      } else {
        System.out.println(numberTwo + " number is greatest.");
      }
    } else if (operation == '=') {
      if (numberOne == numberTwo) {
        System.out.println("Both number is equal.");
      } else {
        System.out.println("Not equal.");
      }
    }
  }
}