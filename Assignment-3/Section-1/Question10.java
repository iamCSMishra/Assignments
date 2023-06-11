import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Year: ");
    int year = sc.nextInt();
    sc.close();

    // output
    if (year % 400 == 0) {
      System.out.println("Entered year is a century & leap year");
    } else {
      if (year % 4 == 0) {
        System.out.println("Entered year is leap year");
      } else {
        System.out.println("Entered year is not a leap & century year");
      }
    }
  }
}