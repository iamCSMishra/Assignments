import java.util.Scanner;

public class Question15 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.print("Enter a character: ");
    char character = sc.next().charAt(0);
    sc.close();

    //Value assigned
    int upperCaseStartRange = 65;
    int upperCaseEndRange = 90;

    //Calculation
    int asciiInput = (int)character;

    //Condition
    boolean isUppercase = (upperCaseStartRange >= asciiInput && asciiInput <= upperCaseEndRange);

    //Output
    String message = "The entered character is " + (isUppercase ? "" : "not ") + "in uppercase.";
    System.out.println(message);
  }
}
