import java.util.Scanner;

public class Question18 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter Days: ");
    int days = sc.nextInt();
    sc.close();
    
    //Calculation
    int month = (days / 30);
    int week = (days / 7);

    //Output
    System.out.println("Months: " + month + ", Weeks: " + week + ", Days: " + days);
  }
}
