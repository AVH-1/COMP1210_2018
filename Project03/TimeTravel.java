import java.util.Scanner;
import java.text.DecimalFormat;
//import java.lang.Math;
//import java.text.DecimalFormat;

/**
 *Pccept coded ticket information to another time and place.
 *Porject 3
 *@author BoyangYu-COMP1210-001
 *@version 01/31/2018
 */
public class TimeTravel  {
   static final double STUDENT_DISCOUNT = .50;
   static final double EMPLOYEE_DISCOUNT = .75;
/**
    *the user enter number to select function.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
   //new a format for number of money.
      DecimalFormat df1 = new DecimalFormat("#,##0.00#");
      DecimalFormat df2 = new DecimalFormat("0000"); 
      //the user enter tick number.
      Scanner userInput = new Scanner(System.in);
      //Declare variables
      int time, ticktNum;
      double cost, price, prize;
      String costStr, ticktStr;
      char categoryStr;
      //random a number betwen 1~9999
      prize = (int) (Math.random() * 10000 + 1);

      //pomp the user enter code
      System.out.print("Enter ticket code: ");
      ticktStr = userInput.nextLine();
      //delete space
      System.out.println();
      ticktStr = ticktStr.trim();
      if (ticktStr.length() < 25) { //check code length
         System.out.println("*** Invalid ticket code ***\nTicket"
            + " code must have at"
            + " least 26 characters.");
      }
      else { //code length bigger than 26
      //print time, date, seat.
         System.out.print("Time: " 
            + ticktStr.substring(0, 2)
            + ":"
            + ticktStr.substring(2, 4)
            + "   "
         );
         System.out.print("Date: " 
               + ticktStr.substring(4, 6) 
               + "/" 
               + ticktStr.substring(6, 8) 
               + "/" 
               + ticktStr.substring(8, 12)
               + "   "
         );
         System.out.println("Seat: " 
            + ticktStr.substring(22, 25)
         );
         //find catrgory for this code
         categoryStr = ticktStr.charAt(12);
         //find cost
         costStr = ticktStr.substring(14, 22);
         //let cost to a integer number
         cost = Integer.parseInt(costStr);
         //make last number be decimal
         price = (Integer.parseInt(ticktStr.substring(14, 22))) * 0.01;
         //print itineraty
         System.out.println("Itinerary: " + ticktStr.substring(25));
         //print format price
         System.out.print("Price: $" 
              + df1.format(price));
         System.out.print("   ");
         //distinguish tickt category
         if (categoryStr == 'e') { //category is e
            price *= EMPLOYEE_DISCOUNT;
         }
         else if (categoryStr == 's') { //category is s
            price *= STUDENT_DISCOUNT;
         }
         //print formated cost
         System.out.print("Cost: $" 
               + df1.format(price));
         //print formated prize and category
         System.out.println("   Category: " + ticktStr.charAt(12)); 
         System.out.println("Prize Number: " + df2.format(prize));
   
      }
   }   
}