import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Getting input
    System.out.println("Enter 1st person's age:");
    int personOneAge = sc.nextInt();
    System.out.println("Enter 2nd person's age:");
    int personSecondAge = sc.nextInt();
    System.out.println("Enter 3rd person's age:");
    int personThirdAge = sc.nextInt();
    sc.close();

    // condition
    if ((personOneAge > personSecondAge) && personOneAge > personThirdAge) {
      System.out.println("Person one is oldest person.");
    } else if (personSecondAge > personThirdAge) {
      System.out.println("Person two is oldest person.");
    } else {
      System.out.println("Person three is oldest person.");
    }

    if ((personOneAge < personSecondAge) && personOneAge < personThirdAge) {
      System.out.println("Person one is youngest person.");
    } else if (personSecondAge < personThirdAge) {
      System.out.println("Person two is youngest person.");
    } else {
      System.out.println("Person three is youngest person.");
    }
  }
}