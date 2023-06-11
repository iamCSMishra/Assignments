import java.util.Scanner;

public class Question14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter your percentage:");
    int percentage = sc.nextInt();
    sc.close();

    // Condition
    if (percentage > 90) {
      System.out.println("You passed with Grade: A");
    } else if ((percentage > 80) && (percentage <= 90)) {
      System.out.println("You passed with Grade: B");
    } else if ((percentage >= 60) && (percentage <= 80)) {
      System.out.println("You passed with Grade: C");
    } else if ((percentage < 60)) {
      System.out.println("You passed with Grade: D");
    }
  }
}