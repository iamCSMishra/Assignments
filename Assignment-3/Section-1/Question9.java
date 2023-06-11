import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Character:");
    char input = sc.next().charAt(0);
    sc.close();
    int ascii = (int) (input);

    // Condition
    if ((ascii >= 65) && (ascii <= 90)) {
      System.out.println("Entered character is uppercase");
    }
    if ((ascii >= 97) && (ascii <= 122)) {
      System.out.println("Entered character is lowercase");
    }
  }
}