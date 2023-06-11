import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter Your Salary:");
    int salary = sc.nextInt();
    System.out.println("Enter Your Service Duration (In Years):");
    int serviceYear = sc.nextInt();
    float bonus = 0;
    sc.close();

    // Condition
    if (serviceYear > 5) {
      bonus = ((salary * 5) / 100f);
    }

    // Output
    System.out.println("Bonus Amount Is: " + bonus);
  }
}
