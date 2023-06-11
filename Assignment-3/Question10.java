import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting input
    System.out.println("Enter Number Between 1 to 5");
    int number = sc.nextInt();
    sc.close();
    // Explicit typecast
    char word = (char) (number);
    // Output
    System.out.println("Number in word: " + word);
  }
}