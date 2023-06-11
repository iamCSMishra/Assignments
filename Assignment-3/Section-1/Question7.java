import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Total Number of Classes Held:");
    int heldClasses = sc.nextInt();
    System.out.println("Enter Total Number of Classes Attend:");
    int attendClasses = sc.nextInt();
    sc.close();
    int attendancePercent = ((attendClasses * 100) / heldClasses);

    // condition
    if (attendancePercent < 75) {
      System.out
          .println("class attended in percent: " + attendancePercent + "\nStudent is not allowed to sit in exam.");
    } else {
      System.out.println("class attended in percent: " + attendancePercent + "\nStudent is allowed to sit in exam.");
    }
  }
}