import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    int length = sc.nextInt();
    System.out.println("Enter breadth:");
    int breadth = sc.nextInt();
    sc.close();

    if (length == breadth) {
      System.out.println("It is square.");
    } else {
      System.out.println("It is rectangle.");
    }
  }
}
