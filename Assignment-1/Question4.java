import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter fahrenheit value: ");
    int fahrenheit = sc.nextInt();
    sc.close();

    //Calculation
    double celsius = (((fahrenheit - 32) * 5) / 9);

    //Output
    System.out.println("Celsius value is:" + celsius);
  }
}
