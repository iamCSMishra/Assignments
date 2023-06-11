import java.util.Scanner;

public class Question19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st Side:");
    int sideA = sc.nextInt();
    System.out.println("Enter 2nd Side:");
    int sideB = sc.nextInt();
    System.out.println("Enter 3rd Side:");
    int sideC = sc.nextInt();
    sc.close();

    // Condition
    if ((sideA == sideB) && (sideB == sideC) && (sideC == sideA)) {
      System.out.println("Equilateral Triangle!");
    } else if ((sideA == sideB) || (sideB == sideC) || (sideC == sideA)) {
      System.out.println("Isosceles Triangle!");
    } else {
      System.out.println("Scalene Triangle!");
    }
  }
}