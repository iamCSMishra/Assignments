import java.util.Scanner;

public class Question23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter Day Number:");
    int day = sc.nextInt();
    sc.close();
    int week = ((day / 7) + 1);

    // Output
    System.out.println(day + "th day will be week number " + week);
  }
}