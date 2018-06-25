import java.util.Scanner;
/**
 *Enter amount by the user and give how many dollars they can get change.
 *
 *Project 02
 *@author BoyangYu-COMP1210-001 
 *@version 01/23/2018
 */
public class ATM {
   /**
    *Use if and else to judge the amount than calculate change.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
   //Declare variables
      int amount, slice;
      int [] change = new int[4];
   //prompt the user for there amount
      System.out.println("Enter the amount: ");
      amount = userInput.nextInt();
   //judge amount limit
      if (amount > 300) { //biger than 300
         System.out.println("Limit of $300 exceeded!");
      }
      else if (amount < 0) { 
         System.out.println("Error");
      }
      else {
               //less or equal than 300
         System.out.println("Bills by denomination: ");
         //slice of 20 dollers change
         slice = amount % 20;
         change[0] = amount / 20;
         System.out.println("\t$20: " + change[0]);
         //slice of 10 dollers change
         change[1] = slice / 10;
         slice = slice % 10;
         System.out.println("\t$10: " + change[1]);
         //slice of 5 dollers change
         change[2] = slice / 5;
         slice = slice % 5;
         System.out.println("\t$5: " + change[2]);
         //slice of 1 dollers change
         change[3] = slice;
         System.out.println("\t$1: " + change[3]);
         //change[0] to [3] is change $20 to $1
         System.out.println("$" 
            + amount 
            + " = (" 
            + change[0] 
            + " * $20) + (" 
            + change[1] 
            + " * $10) + (" 
            + change[2] 
            + " * $5) + (" 
            + change[3] 
            + " * $1)");
      }
   }
   
}
      
