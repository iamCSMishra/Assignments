import java.util.Scanner;

public class Question17 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter height in inches: ");
    int inches = sc.nextInt();
    sc.close();
    
    //Value assigned
    float unitCmInInch = 2.54f;

    //Calculation
    float heightInCm = inches * unitCmInInch;

    //Output
    System.out.println("Height in centimeter is: " + heightInCm);
  }
}
