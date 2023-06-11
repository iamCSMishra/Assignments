import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter radius:");
    int radius = sc.nextInt();
    sc.close();

    // Condition
    float area = ((22 * radius * radius) / 7);

    // Output
    System.out.println("Radius of circle: " + area);
  }
}