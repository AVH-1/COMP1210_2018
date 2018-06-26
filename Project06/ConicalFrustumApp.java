import java.util.Scanner;
/**
 *calutate a Conical Frustum.
 *Activity 4
 *@author BoyangYu-COMP1210-001
 *@version 02/07/2018
 */
public class ConicalFrustumApp {
   /**
    *user typing Conical Frustum imformation and return fumuler vuleu.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label;
      double radius1, radius2, height;      
      System.out.print("Enter label, radius1, radius2,"
         + " and height for a conical frustum.\n\t");
      System.out.print("label: ");
      label = userInput.nextLine();
      System.out.print("\tradius1: ");
      radius1 = userInput.nextDouble();
      if (radius1 < 0) {
         System.out.println("Error: radius1 must be non-negative.");
      }
      else {
         System.out.print("\tradius2: ");
         radius2 = userInput.nextDouble();
         if (radius2 < 0) {
            System.out.print("Error: radius2 must be non-negative.");
         }
         else { 
            System.out.print("\theight: ");
            height = userInput.nextDouble();
            if (height < 0) {
               System.out.println("Error: height must be non-negative.");
            }
            else {
               ConicalFrustum cf = new ConicalFrustum(
                  label, radius1, radius2, height);
               System.out.println(cf);
            }
         }
      }
   }
}