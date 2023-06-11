import java.util.Scanner;

public class Question27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Basic Salary:");
    int basicSalary = sc.nextInt();
    sc.close();
    float houseRentAllowance = 0;
    float dearnessAllowance = 0;
    int grossSalary = 0;

    // Condition
    if (basicSalary <= 10000) {
      houseRentAllowance = ((basicSalary * 20) / 100.0f);
      dearnessAllowance = ((basicSalary * 80) / 100.0f);
      grossSalary = (int) (basicSalary + houseRentAllowance + dearnessAllowance);
      System.out.println("Your gross salary is " + grossSalary);
    } else if ((basicSalary > 10000) && (basicSalary <= 20000)) {
      houseRentAllowance = ((basicSalary * 25) / 100.0f);
      dearnessAllowance = ((basicSalary * 90) / 100.0f);
      grossSalary = (int) (basicSalary + houseRentAllowance + dearnessAllowance);
      System.out.println("Your gross salary is " + grossSalary);
    } else if (basicSalary > 20000) {
      houseRentAllowance = ((basicSalary * 30) / 100.0f);
      dearnessAllowance = ((basicSalary * 95) / 100.0f);
      grossSalary = (int) (basicSalary + houseRentAllowance + dearnessAllowance);
      System.out.println("Your gross salary is " + grossSalary);
    } else {
      System.out.println("Invalid input!");
    }
  }
}