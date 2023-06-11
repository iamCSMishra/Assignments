import java.util.Scanner;

public class Dmart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Getting personal information
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.println("Enter your gender: \nfor male: enter 'M', for female enter'F'");
    char gender = sc.next().charAt(0);

    // Getting quantity
    System.out.println("Enter quantity of first product:");
    int productOne = sc.nextInt();
    System.out.println("Enter quantity of second product:");
    int productTwo = sc.nextInt();
    System.out.println("Enter quantity of third product:");
    int productThree = sc.nextInt();
    System.out.println("Enter quantity of fourth product:");
    int productFour = sc.nextInt();
    System.out.println("Enter quantity of fifth product:");
    int productFive = sc.nextInt();
    System.out.println("Enter quantity of sixth product:");
    int productSix = sc.nextInt();
    System.out.println("Enter quantity of seventh product:");
    int productSeven = sc.nextInt();
    System.out.println("Enter quantity of eighth product:");
    int productEight = sc.nextInt();
    System.out.println("Enter quantity of ninth product:");
    int productNine = sc.nextInt();
    System.out.println("Enter quantity of tenth product:");
    int productTen = sc.nextInt();
    System.out.println("Do you want carry page? \n for yes: Enter 'Y', for no: Enter 'N'");
    char bag = sc.next().charAt(0);
    sc.close();
    String gift = null;

    // Price calculation
    int priceOne = (productOne * 10);
    int priceTwo = (productTwo * 20);
    int priceThree = (productThree * 30);
    int priceFour = (productFour * 40);
    int priceFive = (productFive * 50);
    int priceSix = (productSix * 60);
    int priceSeven = (productSeven * 70);
    int priceEight = (productEight * 80);
    int priceNine = (productNine * 90);
    int priceTen = (productTen * 100);

    float discountOne;
    float discountFive;
    float discountTen;
    float discount;
    int discountedPriceOne = priceOne;
    int discountedPriceFive = priceFive;
    int discountedPriceTen = priceTen;

    int totalPrice = (priceOne + priceTwo + priceThree + priceFour + priceFive + priceSix + priceSeven + priceEight
        + priceNine + priceTen);
    int discountedPrice = (discountedPriceOne + priceTwo + priceThree + priceFour + discountedPriceFive + priceSix
        + priceSeven + priceEight + priceNine + discountedPriceTen);

    // Conditions
    if (productOne > 4) {
      discountOne = ((priceOne * 5) / 100.0f);
      discountedPriceOne = (int) (priceOne - discountOne);
    }
    if (productFive > 0) {
      discountFive = ((priceFive * 10) / 100.0f);
      discountedPriceFive = (int) (priceFive - discountFive);
    }
    if (productTen > 0) {
      discountTen = ((priceTen * 15) / 100.0f);
      discountedPriceTen = (int) (priceTen - discountTen);
    }
    if (totalPrice > 10000) {
      discount = ((totalPrice * 15) / 100.0f);
      discountedPrice = (int) (totalPrice - discount);
    } else if (totalPrice > 5000 && totalPrice < 10000) {
      discount = ((totalPrice * 10) / 100.0f);
      discountedPrice = (int) (totalPrice - discount);
    } else {
      discountedPrice = totalPrice;
    }

    // Gst calculation
    float gst = ((totalPrice * 10) / 100.0f);
    int grossPayable = (totalPrice + discountedPrice);
    int finalDiscountedPrice = (discountedPriceOne + priceTwo + priceThree + priceFour + discountedPriceFive + priceSix
        + priceSeven + priceEight + priceNine + discountedPriceTen);

    // Bag
    int netPayable = (int) (grossPayable + gst);
    if (bag == 'Y' || bag == 'y') {
      netPayable = netPayable + 10;

    }

    // Gift
    if (gender == 'F' || gender == 'f') {
      gift = "Cadbury";
    }
    if (gender == 'M' || gender == 'm') {
      gift = "Wallet";
    }

    // output
    System.out.println("\t \t \t \t \t \t \t D-mart");
    System.out.println("\t Name:" + name + "\t \t \t \t \t \t \t \t \t \t Date: 12/12/2012");
    System.out.println(
        "\t --------------------------------------------------------------------------------------------------------");
    System.out.println("\t Item Name \t \t \t Quantity \t \t \t Price \t \t \t Discounted Price");
    System.out.println(" \t Product - 1 \t \t \t    " + productOne + " \t \t \t \t " + priceOne + " \t \t \t \t "
        + discountedPriceOne);
    System.out
        .println(" \t Product - 2 \t \t \t    " + productTwo + " \t \t \t \t " + priceTwo + " \t \t \t \t " + priceTwo);
    System.out.println(
        " \t Product - 3 \t \t \t    " + productThree + " \t \t \t \t " + priceThree + " \t \t \t \t " + priceThree);
    System.out.println(
        " \t Product - 4 \t \t \t    " + productFour + " \t \t \t \t " + priceFour + " \t \t \t \t " + priceFour);
    System.out.println(" \t Product - 5 \t \t \t    " + productFive + " \t \t \t \t " + priceFive + " \t \t \t \t "
        + discountedPriceFive);
    System.out
        .println(" \t Product - 6 \t \t \t    " + productSix + " \t \t \t \t " + priceSix + " \t \t \t \t " + priceSix);
    System.out.println(
        " \t Product - 7 \t \t \t    " + productSeven + " \t \t \t \t " + priceSeven + " \t \t \t \t " + priceSeven);
    System.out.println(
        " \t Product - 8 \t \t \t    " + productEight + " \t \t \t \t " + priceEight + " \t \t \t \t " + priceEight);
    System.out.println(
        " \t Product - 9 \t \t \t    " + productNine + " \t \t \t \t " + priceNine + " \t \t \t \t " + priceNine);
    System.out.println(" \t Product - 10 \t \t \t    " + productTen + " \t \t \t \t " + priceTen + " \t \t \t \t "
        + discountedPriceTen);
    System.out.println(
        "\t --------------------------------------------------------------------------------------------------------");
    System.out.println("\t \t \t \t \t \t \t \t   Actual Price \t \t \t Discounted Price");
    System.out.println("\t \t \t \t \t \t \t \t   " + totalPrice + " \t \t \t \t \t " + finalDiscountedPrice);
    System.out.println("\t Gift: " + gift + "\t \t \t \t \t \t  0.00 \t \t \t \t \t 0.00");
    if (bag == 'Y' || bag == 'y') {
      System.out.println("\t Carry Bag: " + bag + "\t \t \t \t \t \t   10.00 \t \t \t \t  10.00");
      finalDiscountedPrice = finalDiscountedPrice + 10;
    }
    System.out.println("\t GST(10%): \t \t \t \t \t \t" + gst + "\t \t \t \t \t" + gst);
    System.out.println(
        "\t --------------------------------------------------------------------------------------------------------");
    System.out
        .println("\t \t \t \t \t \t \t \t" + (totalPrice + gst) + " \t \t \t \t \t " + (finalDiscountedPrice + gst));
    System.out.println(
        "\n \n \t \t \t \t \t \t \t Thank You \n \t \t \t \t \t \t \t  To Vsit \n \t \t \t \t \t \t \t   D-Mart.\n \n");
    System.out.println(
        "\t --------------------------------------------------------------------------------------------------------");
  }
}