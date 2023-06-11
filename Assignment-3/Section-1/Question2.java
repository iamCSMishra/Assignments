import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting quantity
    System.out.println("Enter Quantity");
    int productQuantity = sc.nextInt();
    sc.close();

    // Price calculation
    int rate = 100;
    int price = (productQuantity * rate);
    float discount = 0;

    // condition
    if (productQuantity > 1000) {
      discount = ((price * 15) / 100.0f);
    } else {
      discount = 0;
    }
    int discountedPrice = (int) (price - discount);

    // Output
    System.out.println("Total cost for user: " + (discountedPrice));
  }
}