import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Marks Obtain");
    int marksObtain = sc.nextInt();
    System.out.println("Enter Total Marks");
    int totalMarks = sc.nextInt();
    sc.close();
    int percentage = ((marksObtain * 100) / totalMarks);

    // Output
    System.out.println("Percentage is: " + percentage);
  }
}