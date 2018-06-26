import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 *Create a ConicalFrustumList class that stores the name of the list and an
 *ArrayList of ConicalFrustum objects.
 *
 *@author Boyang Yu
 *@version 03/02/2018
 */
public class ConicalFrustumList2MenuApp {
/**
    * applacation for ConicalFrustum class.
	 * 
    * @param args - Standard commandline arguments.
    * @throws FileNotFoundException for data file.
    */

   public static void main(String[] args) throws FileNotFoundException {
      String fileName, userIn;
      ArrayList<ConicalFrustum> aLCF = new ArrayList<ConicalFrustum>();
      String listName = "*** no list name assigned ***";
      ConicalFrustumList cFL = new ConicalFrustumList(listName, aLCF);
      Scanner scanInput = new Scanner(System.in);
      System.out.print("ConicalFrustum List System Menu\n"
         + "R - Read File and Create ConicalFrustum List \n"
         + "P - Print ConicalFrustum List\n"
         + "S - Print Summary\n"
         + "A - Add ConicalFrustum\n"
         + "D - Delete ConicalFrustum\n"
         + "F - Find ConicalFrustum\n"
         + "E - Edit ConicalFrustum\n"
         + "Q - Quit\n");
         
      do {
         String label;
         double radius1, radius2, height;
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         //char userCharIn = userIn.charAt(0);
         userIn = scanInput.nextLine();
         if (userIn.length() == 0) {
            continue;
         }
         userIn = userIn.toUpperCase();
         char userInChar = userIn.charAt(0);  
         switch (userInChar) {
            case 'R':
         
               System.out.print("\tFile name: ");
               fileName = scanInput.nextLine();
               cFL = cFL.readFile(fileName);
               System.out.println("\tFile read in and ConicalFrustum" 
                  + " List created\n");
               break;
            
            case 'P':
         
               System.out.print(cFL);
               break;
         
            case 'S':
            
               System.out.println("\n" + cFL.summaryInfo());
               break;
            
            case 'A':
         
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               System.out.print("\tRadius1: ");
               radius1 = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tRadius2: ");
               radius2 = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
               cFL.addConicalFrustum(label, radius1, radius2, height);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;
            
            case 'D':
         
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               if (cFL.deleteConicalFrustum(label) != null) {
                  cFL.deleteConicalFrustum(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'F':
            
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               if (cFL.findConicalFrustum(label) != null) {
                  System.out.println(cFL.findConicalFrustum(label).toString()
                  );
               } 
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
         
            case 'E':
         
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               System.out.print("\tRadius1: ");
               radius1 = Double.parseDouble(scanInput.nextLine());
                           
               System.out.print("\tRadius2: ");
               radius2 = Double.parseDouble(scanInput.nextLine());
                           
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
               
               if (cFL.findConicalFrustum(label) != null) {
                  cFL.editConicalFrustum(label, radius1, radius2, height);
                  System.out.println("\"" + label + "\" successfully edited");
                  System.out.println("");
               } else {
                  System.out.println("\"" + label + "\" not found");
                  System.out.println("");
               }
               break;
               
            case 'Q':
         
               break;
            
            default:
            
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      }
      
      while (!userIn.equalsIgnoreCase("Q"));

    }
}