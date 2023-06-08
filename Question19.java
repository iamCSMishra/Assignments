import java.util.Scanner;

public class Question19 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.print("Enter a character: ");
    char input = sc.next().charAt(0);
    sc.close();

    //Condition
    boolean isVowel = ( (input == 'a') || (input == 'e') || (input == 'i') || (input == 'o') || (input == 'u') || (input == 'A') || (input == 'E') || (input == 'I') || (input == 'O') || (input == 'U') );

    //Output
    String message = "The entered character is " + (isVowel ? "" : "not ") + " Vowel.";
    System.out.println(message);
  }
}
