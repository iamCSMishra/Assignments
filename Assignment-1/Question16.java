import java.util.Scanner;

public class Question16 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter two numbers: ");
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    sc.close();

    //Condition
    String message = (numOne == numTwo) ? "Both values are equal." : ((numOne > numTwo) ? "Number " + numOne + " is greater then number " + numTwo : "Number " + numTwo + " is greater then number " + numOne);

    //Output
    System.out.println(message);
  }
}
