import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter two numbers: ");
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    sc.close();

    //Output
    System.out.println("Before swapping: " + "\n" + "Number one: " + numOne + "\n"+ "Number two: " + numTwo);

    //Calculation
    numOne = numOne + numTwo;
    numTwo = numOne - numTwo;
    numOne = numOne - numTwo;

    //Output
    System.out.println("After swapping: " + "\n" + "Number one: " + numOne + "\n" + "Number two: " + numTwo);
  }
}
