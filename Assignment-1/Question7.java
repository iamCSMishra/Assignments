import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter Principal: ");
    int principal = sc.nextInt();
    System.out.println("Enter Rate: ");
    float rate = sc.nextFloat();
    System.out.println("Enter Time: ");
    int time = sc.nextInt();
    sc.close();

    //Calculation
    float simpleInterest = ((principal * rate * time) / 100f);

    //Output
    System.out.println("Simple Interest is: " + simpleInterest);

  }
}
