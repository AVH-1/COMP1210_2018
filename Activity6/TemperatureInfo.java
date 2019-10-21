import java.util.Scanner;
import java.util.ArrayList;
/**
 *In this activity you will create two classes. Temperatures will hold a set 
 *of integer values representing daily temperatures. TemperatureInfo will 
 *allow users to interact with the Temperatures class.
 *
 *@author Boyang Yu
 *@version 02/23/2018
 */
public class TemperatureInfo {
   /**
    * 
	 * 
    * @param args - Standard commandline arguments.
    * @args FileNotFoundException for data file.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
    
      Temperatures temps = new Temperatures(tempList);
    
      char choice = 'E';
      do {
         System.out.print("Enter choice = [L]ow temp, [H]igh temp, " 
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}
