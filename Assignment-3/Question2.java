import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Length:");
    int length = sc.nextInt();
    System.out.println("Enter Width:");
    int width = sc.nextInt();
    sc.close();
    int area = (length * width);

    // Output
    System.out.println("Area of rectangle: " + area);
  }
}