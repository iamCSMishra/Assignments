import java.util.Scanner;

public class Question26 {
  public static void main(String[] args) {
    // Scanner object created
    Scanner sc = new Scanner(System.in);

    // taking input
    System.out.println("Enter obtain marks in physics:");
    int physicsMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of Physics:");
    int physicsTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in chemistry:");
    int chemistryMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of chemistry:");
    int chemistryTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in biology:");
    int biologyMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of biology:");
    int biologyTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in maths:");
    int mathsMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of maths:");
    int mathsTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in computer:");
    int computerMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of computer:");
    int computerTotalMark = sc.nextByte();
    sc.close();

    // Calculation
    int marksObtain = physicsMarkObtain + chemistryMarkObtain + biologyMarkObtain + mathsMarkObtain
        + computerMarkObtain;
    int totalMarks = physicsTotalMark + chemistryTotalMark + biologyTotalMark + mathsTotalMark + computerTotalMark;
    int percent = ((marksObtain * 100) / totalMarks);

    // Condition
    if (percent >= 90) {
      System.out.println("You obtain " + percent + "% Grade A");
    } else if ((percent >= 80) && (percent < 90)) {
      System.out.println("You obtain " + percent + "% Grade B");
    } else if ((percent >= 70) && (percent < 80)) {
      System.out.println("You obtain " + percent + "% Grade C");
    } else if ((percent >= 60) && (percent < 70)) {
      System.out.println("You obtain " + percent + "% Grade D");
    } else if ((percent >= 40) && (percent < 60)) {
      System.out.println("You obtain " + percent + "% Grade E");
    } else if (percent < 40) {
      System.out.println("You obtain " + percent + "% Grade F");
    } else {
      System.out.println("Invalid Input!");
    }
  }
}