import java.util.Scanner;

public class Question11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter your age:");
    int age = sc.nextInt();
    System.out.println("Enter your sex: for male 'M' & for female 'f'");
    char gender = sc.next().charAt(0);
    System.out.println("Are you married?  for yes 'Y' & for no 'N'");
    char maritalStatus = sc.next().charAt(0);
    sc.close();
    String workArea = "";

    // Condition
    if ((gender == 'f') || (gender == 'F')) {
      workArea = "Urban";
      System.out.println("She will work only in " + workArea + " areas.");
    } else if (((gender == 'm') || (gender == 'M')) && ((age >= 20) && (age < 40))) {
      workArea = "Anywhere";
      System.out.println("He will " + workArea + ".");
    } else if (((gender == 'm') || (gender == 'M')) && ((age >= 40) && (age <= 60))) {
      workArea = "Urban";
      System.out.println("He will work only in " + workArea + " areas.");
    } else {
      System.out.println("Invalid Input!");
    }
  }
}