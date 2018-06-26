
import java.io.FileNotFoundException;
/** 	
  * bunniesPart3.	
  * @author Buyang Yu_COMP1210
  * @version 04/26/2018
  */
   public class BunniesPart3 {
      public static void main (String[] args) {
         if(args.length == 0) {
         
            System.out.print("*** File name not provided by command "
               + "line argument." 
               + "\nProgram ending.\n");
            return ;
         }
         
         BunnyList bL = new BunnyList();
         
         try {
            bL.readBunnyFile(args[0]);
         }
         
         catch (FileNotFoundException fNFE) {
            System.out.print("*** File not found.\n" 
               + "Program ending.");
            return ;
         }
         
         System.out.print(bL.summary() 
            + "\n"
            + bL.listByName()
            + "\n"
            + bL.listByCost()
            + "\n"
            + bL.excludedRecordsList()
            + "\n"
            );
         
      }
   
   }