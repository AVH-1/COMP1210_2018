import java.util.Arrays;
import java.io.file;
import java.text.DecimalFormat;

public class BunnyList{

   private String listName, excludedRecords;
   private Bunny bunnyList;
   
   public BunnyList(){
      listName = "not yet assigned";
      bunnyList = Bunny[0];
      excludedRecords = 0;
   }
   
   public void readItemFile(String fileNameIn) throws FileNotFoundException {
   
      Scanner scanName = new Scanner(new File(fileNameIn));
      String listNameIn = scanName.nextLine();
      setListName(listNameIn);
      Scanner scanFile;
      String nameIn, breedIn, bunnyiaIn, optStr = "";
      double weightIn, wearAndTearIn, trainingIn, groomingIn;
      
      while (scanName.hasNext()) {
      
         bunnyiaIn = scanName.nextLine();
         scanFile = new Scanner(bunnyiaIn);
         scanFile.useDelimiter(",");
         optStr = scanFile.next().toUpperCase().charAt(0);
         
         switch (optStr) {
                       

            case 'P':
            
               nameIn = ScanFile.next().trim();
               breedIn = ScanFile.next().trim();
               weightIn = Double.parseDouble(lineScan.next().trim());
               addBunny(new PetBunny(nameIn, breedIn, weightIn));
               break;
               
            case 'h':
               name = ScanFile.next().trim();
               breed = ScanFile.next().trim();
               weight = Double.parseDouble(ScanFile.next().trim());
               wearAndTearIn = Double.parseDouble(lineScan.next().trim());
               addBunny(new HouseBunny(nameIn, breedIn, weightIn, wearAndTearIn));
            
               break;

            case 'j':
               name = ScanFile.next().trim();
               breed = ScanFile.next().trim();
               weight = Double.parseDouble(ScanFile.next().trim());
               trainingIn = Double.parseDouble(ScanFile.next().trim());
               addBunny(new JumpingBunny(nameIn, breedIn, weightIn, trainingIn));
               
               break;
            case 's':
            
               name = ScanFile.next().trim();
               breed = ScanFile.next().trim();
               weight = Double.parseDouble(ScanFile.next().trim());
               groomingIn = Double.parseDouble(ScanFile.next().trim());
               addBunny(new ShowBunny(nameIn, breedIn, weightIn,
                  groomingIn));
            
            default:
               this.addExcludedRecord(bunnyiaIn);
               break;

         }
      }
   }
   
   
   public String getListName() {
      return listName;
   }
   
   public obj[] getBunnyList() {
      return bunnyList;
   }
   
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   
   public void addBunny(obj bunnyIn) {
   
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }
   
   public void addExcludedRecord(String excludedRecordIn) {
   
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecord.length + 1);
         
      excludedRecords[excludedRecords.length - 1] = excludedRecordIn;
   }
   
   public String toString() {
      String str;
      for(int i = 0; i < bunnyList.length; i++) {
         str += "\n" + bunnyList[i].toString() + "\n";
      }
      return str;
   }
   
   public double totalEstimatedMonthlyCost() {
      double total = 0.0;
      for(int i = 0; i < bunnyList.length; i++) {
         tolal += bunnyList[i].estimatedMonthlyCost();
      }
      return total;
   }
   
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
   
   public String listByName() {
      Arrays.sort(bunnyList);
      
      String str = "------------------------------\n";
      str += "Bunnies by Name\n"
         + "------------------------------\n"
         + BunnyList;
      return str;
   
   }
   
   public String listByCost() {
      Arrays.sort(bunnyList, new CostComparator());
      String str = "------------------------------\n";
      result += "Bunnies by Cost\n"
         + "------------------------------\n";
      for(bunny cc : bunnyList) {
         str += "\n" + cc.toString + "\n";
      }
      
      return str;
   }
   
   public String excludedRecordsList() {
      
      String str = "------------------------------\n";
      str += "Excluded Records\n"
         + "------------------------------\n";
      for(String cc : excludedRecords) {
         str += "\n"
            + cc
            + "\n";
      }
      return str;
   }
   
}