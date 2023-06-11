import java.util.Scanner;

public class Question13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter 1st Number:");
    int numberOne = sc.nextInt();
    System.out.println("Enter Operator: + - / *");
    char operator = sc.next().charAt(0);
    System.out.println("Enter 2nd Number:");
    int numberTwo = sc.nextInt();
    sc.close();
    int result = 0;

    // Condition
    switch (operator) {
      case '+':
        result = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + result);
        break;
      case '-':
        result = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + result);
        break;
      case '/':
        result = numberOne / numberTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + result);
        break;
      case '*':
        result = numberOne * numberTwo;
        System.out.println(numberOne + " * " + numberTwo + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}