import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter two numbers: ");
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    int numTemp = 0;
    sc.close();

    //Output
    System.out.println("Before swapping: " + "\n" + "Number One: " + numOne + "\n" + "Number Two: " + numTwo);

    //Calculation
    numTemp = numOne;
    numOne = numTwo;
    numTwo = numTemp;

    //Output
    System.out.println("After swapping: " + "\n" + "Number One: " + numOne + "\n" + "Number Two: " + numTwo);
  }
}
