import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    sc.close();

    //Condition
    String voter = (age >= 18) ? "Eligible for voting." : "Not eligible for voting.";
    
    //Output
    System.out.println(voter);
  }
}
