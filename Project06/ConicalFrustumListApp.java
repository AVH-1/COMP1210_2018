import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *Create a ConicalFrustumList class that stores the name of the list and an
 *ArrayList of ConicalFrustum objects.
 *
 *@author Boyang Yu
 *@version 02/20/2018
 */
public class ConicalFrustumListApp {

   /**
    * give the String that display caculation of conical frustums.
	 * 
    * @param args - Standard commandline arguments.
    * @throws FileNotFoundException for data file.
    */
   public static void main(String[] args)throws FileNotFoundException {
   	String fileName, cFName;
      String label;
      double radius1, radius2, height;
      Scanner in = new Scanner(System.in);
      ArrayList<ConicalFrustum> coFruList 
            = new ArrayList<ConicalFrustum>();
            
      //pomp user enter file name
      System.out.print("Enter file name: ");
      fileName = in.nextLine();
      //fileName = "conical_frustum_data_1.txt";
      Scanner fileIn = new Scanner(new File(fileName));
      System.out.println();
      cFName = fileIn.nextLine();
      //conical_frustum_data_1.txt
      
      while (fileIn.hasNext()) {
         label = fileIn.nextLine();
         radius1 = Double.parseDouble(fileIn.nextLine());
         radius2 = Double.parseDouble(fileIn.nextLine());
         height = Double.parseDouble(fileIn.nextLine());
         ConicalFrustum conFr =
            new ConicalFrustum(label, radius1, radius2, height);
         coFruList.add(conFr);
      }
 
      ConicalFrustumList conFruList = 
         new ConicalFrustumList(cFName, coFruList);
      //System.out.print(conFruList.totalVolume());
      System.out.println(conFruList);
      System.out.print(conFruList.summaryInfo());
   } 
}
      
