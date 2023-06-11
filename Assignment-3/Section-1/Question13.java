import java.util.Scanner;

public class Question13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter number between 1 to 7");
    int number = sc.nextInt();
    sc.close();
    String day = "";

    // Condition
    if (number == 1) {
      day = "Sunday";
    } else if (number == 2) {
      day = "Monday";
    } else if (number == 3) {
      day = "Tuesday";
    } else if (number == 4) {
      day = "Wednesday";
    } else if (number == 5) {
      day = "Thursday";
    } else if (number == 6) {
      day = "Friday";
    } else if (number == 7) {
      day = "Saturday";
    } else {
      System.out.println("Invalid Input!");
    }

    // Output
    System.out.println("Day is: " + day);
  }
}