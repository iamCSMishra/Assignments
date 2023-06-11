import java.util.Scanner;

public class Question20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Character");
    char character = sc.next().charAt(0);
    sc.close();
    int ascii = (int) (character);

    // condition
    if (((ascii >= 65) && (ascii <= 90) || (ascii >= 97) && (ascii <= 122))) {
      System.out.println("Character is alphabet.");
    } else {
      System.out.println("Character is not a alphabet.");
    }
  }
}
