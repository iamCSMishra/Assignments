import java.util.Scanner;

public class Question11 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter Principal: ");
    int principal = sc.nextInt();
    System.out.println("Enter Interest Rate: ");
    int rate = sc.nextInt();
    System.out.println("Enter Compounding Frequency: ");
    int frequency = sc.nextInt();
    System.out.println("Enter Time: ");
    int time = sc.nextInt();
    sc.close();

    //Calculation
    int amount = principal * (1 + (rate / (frequency * 100))) ^ (frequency * time);
    int compoundInterest = amount - principal;

    //Output
    System.out.println("Compound interest: " + compoundInterest);
  }
}
