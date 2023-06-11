import java.util.Scanner;

public class Question16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter temperature:");
    int temperature = sc.nextInt();
    System.out.println("Press 'C' for convert into Celsius\nPress 'F' for convert into Fahrenheit");
    char converter = sc.next().charAt(0);
    sc.close();
    float output = 0.0f;

    // Condition
    if ((converter == 'C') || (converter == 'c')) {
      output = (((temperature - 32) * 5) / 9);
      System.out.println("Celsius value is " + output);
    } else if ((converter == 'F') || (converter == 'f')) {
      output = (((temperature * 9) / 5) + 32);
      System.out.println("Fahrenheit value is " + output);
    } else {
      System.out.println("Invalid input!");
    }
  }
}