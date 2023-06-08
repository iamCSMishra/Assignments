import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    //Scanner object created
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.println("Enter obtain marks in physics:");
    int physicsMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of Physics:");
    int physicsTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in chemistry:");
    int chemistryMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of chemistry:");
    int chemistryTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in maths:");
    int mathsMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of maths:");
    int mathsTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in hindi:");
    int hindiMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of hindi:");
    int hindiTotalMark = sc.nextByte();

    System.out.println("Enter obtain marks in english:");
    int englishMarkObtain = sc.nextByte();
    System.out.println("Enter total marks of english:");
    int englishTotalMark = sc.nextByte();
    sc.close();
    
    //Calculation
    int marksObtain = physicsMarkObtain + chemistryMarkObtain + mathsMarkObtain + hindiMarkObtain + englishMarkObtain;
    int totalMarks = physicsTotalMark + chemistryTotalMark + mathsTotalMark + hindiTotalMark + englishTotalMark;
    int percent = ((marksObtain * 100) / totalMarks);

    //Condition
    String output = (percent >= 60) ? "You are passed with 1st division." : (percent >= 50) ? "You are passed with 2nd division." : (percent >= 33) ? "You are passed with 3rd division" : "You are failed";

    //Output
    System.out.println("Total marks obtain: " + marksObtain + "\n" + "Percent is: " + percent + "\n" +output);
  }
}
