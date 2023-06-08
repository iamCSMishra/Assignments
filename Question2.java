import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter Three Numbers: ");
    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();
    int numThree = sc.nextInt();
    sc.close();

    //Condition
    int numSmallest = (numOne < numTwo) ? ((numOne < numThree) ? numOne : numThree) : (numTwo < numThree ? numTwo : numThree) ;

    //Output
    System.out.println("Smallest number is " + numSmallest);
  }
}
