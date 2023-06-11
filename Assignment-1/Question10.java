import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter Radius: ");
    int radius = sc.nextInt();
    System.out.println("Enter Height: ");
    int height = sc.nextInt();
    sc.close();

    //Calculation
    float volume = ((22f / 7) * (radius * radius) * height);

    //Output
    System.out.println("Volume of cylinder:" + volume);
  }
}
