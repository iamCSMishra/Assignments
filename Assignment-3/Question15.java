import java.util.Scanner;

public class Question15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Year:");
    int year = sc.nextInt();
    sc.close();

    // condition
    if (year % 4 == 0) {
      System.out.println(year + " is leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}