import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      int numIn;
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numOpsList 
            = new ArrayList<NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
   
      // get first user input using in.nextInt()
      numIn = in.nextInt();

      while (numIn != 0) {
         NumberOperations cc = new NumberOperations(numIn);
         numOpsList.add(cc);
         numIn = in.nextInt();
      }
            
      int index = 0;
      while (index < numOpsList.size()) {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
      	// add print statement for odds under num
         System.out.println("\tOdds under: " + num.oddsUnder());
         
      	// add print statement for powers of 2 under num
         System.out.println("\tPowers of 2 under: " + num.powersTwoUnder());
         
         index++;
      }
   }
}