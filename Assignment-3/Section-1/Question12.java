import java.util.Scanner;

public class Question12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 4 Digit Number:");
    int number = sc.nextInt();
    sc.close();
    int one = (number / 1000);
    int two = ((number / 100) % 10);
    int three = ((number / 10) % 10);
    int four = (number % 10);

    // output
    System.out.println("Reverse Number: " + four + "" + three + "" + two + "" + one);
  }
}