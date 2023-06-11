import java.util.Scanner;

public class Question12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter Character");
    char character = sc.next().charAt(0);
    sc.close();

    // Condition
    switch (character) {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println(character + " is a vowel.");
        break;

      default:
        System.out.println(character + " is a non vowel character.");
    }
  }
}