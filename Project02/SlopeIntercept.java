import java.util.Scanner;
/**
 *calculate coordinates slope and intercept.
 *
 *Project 2
 *@author BoyangYu-COMP1210-001
 *@version 01/23/2018
 */
public class SlopeIntercept {
   /**
 *the user enter ending and staring points and use formula to calculate.
 *@param args Command line arguments – not used.
 */
   public static void main(String[] args) {
   //Declare variables
      Scanner userInput = new Scanner(System.in);
      double slope, yLintercept, xLintercept, x1, x2, y1, y2;
   //prompt the user for there value for starting point:
      System.out.print("Enter the X and Y coordinates "
         + "of starting point: \n\tx1 = ");
      x1 = userInput.nextInt();
      System.out.print("\ty1 = ");
      y1 = userInput.nextInt();
   //prompt the user for there ending point:
      System.out.print("Enter the X and Y "
         + "coordinates of ending point: \n\tx2 = ");
      x2 = userInput.nextInt();
      System.out.print("\ty2 = ");
      y2 = userInput.nextInt();
   //print word
      System.out.print("Slope: ");
   //to judge the value if it illegal
      if (x1 == x2) { //x1 = to x2 print
         System.out.print("\"" + "undefined\"");
      }
      else if (y1 == y2) { //y1 = y2 print
         //caculating
         slope = (y2 - y1) / (x2 - x1);
         yLintercept = y1 - slope * x1;
         //print the value
         System.out.println(slope);
         System.out.println("Y intercept: " + yLintercept);
         System.out.println("X intercept: " + "\"undefined\"");
      }
      else { //other case
         //caculating
         slope = (y2 - y1) / (x2 - x1);
         yLintercept = y1 - slope * x1;
         xLintercept = -1 * yLintercept / slope;
        //print the value
         System.out.println(slope);
         System.out.println("Y intercept: " + yLintercept);
         System.out.println("X intercept: " + xLintercept);
      }
   }
}