import java.util.Arrays;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
/** 	
  * the CostComparator.	
  * @author Boyang Yu
  * @version 04/16/2018
  */	
public class BunnyList {

   private String listName;
   private Bunny[] bunnyList;
   private String[] excludedRecords;
   /**
    *
    *constracter.
    *
    */
   public BunnyList() {
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }
   /**
    *@param fileNameIn fileName user give.
    *@throws FileNotFoundException .
    */
   public void readBunnyFile(String fileNameIn) throws FileNotFoundException {
   
      Scanner scanName = new Scanner(new File(fileNameIn));
      String listNameIn = scanName.nextLine();
      setListName(listNameIn);
      Scanner scanFile;
      String nameIn, breedIn, bunnyiaIn = "";
      double weightIn, wearAndTearIn, trainingIn, groomingIn;
      char optStr;
      
      while (scanName.hasNext()) {
      
         bunnyiaIn = scanName.nextLine();
         scanFile = new Scanner(bunnyiaIn);
         scanFile.useDelimiter(",");
         optStr = scanFile.next().toUpperCase().charAt(0);
         
         switch (optStr) {
                       

            case 'P':
            
               nameIn = scanFile.next().trim();
               breedIn = scanFile.next().trim();
               weightIn = Double.parseDouble(scanFile.next().trim());
               addBunny(new PetBunny(nameIn, breedIn, weightIn));
               break;
               
            case 'h':
               nameIn = scanFile.next().trim();
               breedIn = scanFile.next().trim();
               weightIn = Double.parseDouble(scanFile.next().trim());
               wearAndTearIn = Double.parseDouble(scanFile.next().trim());
               addBunny(new HouseBunny(nameIn, breedIn, weightIn,
                  wearAndTearIn));
            
               break;

            case 'j':
               nameIn = scanFile.next().trim();
               breedIn = scanFile.next().trim();
               weightIn = Double.parseDouble(scanFile.next().trim());
               trainingIn = Double.parseDouble(
                  scanFile.next().trim());
               addBunny(new JumpingBunny(nameIn, breedIn, weightIn,
                  trainingIn));
               
               break;
            case 's':
            
               nameIn = scanFile.next().trim();
               breedIn = scanFile.next().trim();
               weightIn = Double.parseDouble(scanFile.next().trim());
               groomingIn = Double.parseDouble(scanFile.next().trim());
               addBunny(new ShowBunny(nameIn, breedIn, weightIn,
                  groomingIn));
            
            default:
               this.addExcludedRecord(bunnyiaIn);
               break;

         }
      }
   }
   /**
    *@return the listName.
    */
   
   public String getListName() {
      return listName;
   }
   /**
    *@return the bunnyList.
    */
   public Bunny[] getBunnyList() {
      return bunnyList;
   }
   /**
    *@return the excludedRecords.
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   /**
    *@param listNameIn the user give.
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   /**
    *@param bunnyIn the user give.
    */
   public void addBunny(Bunny bunnyIn) {
   
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }
   /**
    *@param excludedRecordIn the user give.
    */
   public void addExcludedRecord(String excludedRecordIn) {
   
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
         
      excludedRecords[excludedRecords.length - 1] = excludedRecordIn;
   }
   /**
    *@return the toString;
    */
   public String toString() {
      String str = "";
      for (int i = 0; i < bunnyList.length; i++) {
         str += "\n" + bunnyList[i].toString() + "\n";
      }
      return str;
   }
   /**
    *@return  total Estimated Monthly Cost.
    */
   public double totalEstimatedMonthlyCost() {
      double total = 0.0;
      for (int i = 0; i < bunnyList.length; i++) {
         total += bunnyList[i].estimatedMonthlyCost();
      }
      return total;
   }
   /**
    *@return the summary;
    */
   public String summary() {
      DecimalFormat defo = new DecimalFormat("$#,##0.00");
      
      String str = "------------------------------\n"
         + "Summary for"
         + listName 
         + "\n"
         + "------------------------------"
         + "\nNumber of Bunnies: " 
         + bunnyList.length
         + "\nTotal Estimated Monthly Cost: "
         + defo.format(totalEstimatedMonthlyCost());
      str += "\n";
      return str;
   }
   /**
    *@return the list By Name;
    */
   public String listByName() {
      Arrays.sort(bunnyList);
      
      String str = "------------------------------\n";
      str += "Bunnies by Name\n"
         + "------------------------------\n"
         + bunnyList;
      return str;
   
   }
   /**
    *@return list By Cost.
    */
   public String listByCost() {
      Arrays.sort(bunnyList, new CostComparator());
      String str = "------------------------------\n";
      str += "Bunnies by Cost\n"
         + "------------------------------\n";
      for (Bunny cc : bunnyList) {
         str += "\n" + cc.toString() + "\n";
      }
      
      return str;
   }
   /**
    *@return the excluded Records List.
    */
   public String excludedRecordsList() {
      
      String str = "------------------------------\n";
      str += "Excluded Records\n"
         + "------------------------------\n";
      for (String cc : excludedRecords) {
         str += "\n"
            + cc
            + "\n";
      }
      return str;
   }
   
}