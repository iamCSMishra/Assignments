import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter five digits: ");
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    int numThree = sc.nextInt();
    int numFour = sc.nextInt();
    int numFive = sc.nextInt();
    sc.close();

    //Calculation
    double average = (numOne + numTwo + numThree + numFour + numFive) / 5;

    //Output
    System.out.println("Average of five digits is: " + average);
  }
}
