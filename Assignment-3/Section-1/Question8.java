import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Total Number of Classes Held:");
    int heldClasses = sc.nextInt();
    System.out.println("Enter Total Number of Classes Attend:");
    int attendClasses = sc.nextInt();
    System.out.println("Do you have any medical issue? : for Yes enter 'Y' for No enter 'N'");
    char medicalIssue = sc.next().charAt(0);
    sc.close();
    int attendancePercent = ((attendClasses * 100) / heldClasses);

    // condition
    if ((medicalIssue == 'Y') || (medicalIssue == 'y')) {
      System.out.println("class attended in percent: " + attendancePercent + "\nStudent is allowed to sit in exam.");
    } else {
      if (attendancePercent < 75) {
        System.out
            .println("class attended in percent: " + attendancePercent + "\nStudent is not allowed to sit in exam.");
      } else {
        System.out.println("class attended in percent: " + attendancePercent + "\nStudent is allowed to sit in exam.");
      }
    }
  }
}