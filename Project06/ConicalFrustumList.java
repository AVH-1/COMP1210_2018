import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Conical Frustum List App.
 */
public class ConicalFrustumList {

   private ArrayList<ConicalFrustum> conFruList;
   private String conFruStr;
/**
 * @param conFruListIn user give.
 * @param conFruStrIn user give.
 */
   public ConicalFrustumList(String conFruStrIn,
       ArrayList<ConicalFrustum> conFruListIn
   ) {
      conFruList = conFruListIn;
      conFruStr = conFruStrIn;
   }
/**
 *@return the conFruStr.
 */
   public String getName() {

      return conFruStr;

   }
/**
 *@return the nuber of conFruList
 */
   public int numberOfConicalFrustums() {
      return conFruList.size();
   }
/**
 *@return total surface area
 */
   public double totalSurfaceArea() {
      int i = 0;
      double d = 0;
      while (i < conFruList.size()) {
         d += conFruList.get(i).totalSurfaceArea();
         i++;
      }
      return d;
   }
/**
 *@return the total volume.
 */
   
   public double totalVolume() {
      int i = 0;
      double d = 0;
      while (i < conFruList.size()) {
         d += conFruList.get(i).volume();
         i++;
      }
      return d;
   }
/**
 *@return average surface area.
  */
   public double averageSurfaceArea() {
      int i = 0;
      double d = 0.0;
      if (conFruList.size() == 0) {
         return d;
      }
      else {
         while (i < conFruList.size()) {
            d += conFruList.get(i).totalSurfaceArea();
            i++;
         }

         d /= conFruList.size();
         return d;
      }
   }
/**
 *@return average volume.
 */
   public double averageVolume() {
      int i = 0;
      double d = 0.0;
      if (conFruList.size() == 0) {
         return d;
      }
      else {
         while (i < conFruList.size()) {
            d += conFruList.get(i).volume();
            i++;
         }
         d /= conFruList.size();
         return d;
      }
   }
   /**
    *@return the conical frustum list in the class.
    */
   public ArrayList<ConicalFrustum> getList(){
      return conFruList;
   }
   /**
    *@param fileNameIn is the file name the user enter.
    *@return a conical frustum list use file name.
    */
   public ConicalFrustumList readFile(String fileNameIn)
      throws FileNotFoundException{
      String label, cFName;
      double radius1, radius2, height;
      Scanner scanUser = new Scanner(new File(fileNameIn));
      ArrayList<ConicalFrustum> coFruList
         = new ArrayList<ConicalFrustum>();
      cFName = scanUser.nextLine();
      while (scanUser.hasNext()) {
         label = scanUser.nextLine();
         radius1 = Double.parseDouble(scanUser.nextLine());
         radius2 = Double.parseDouble(scanUser.nextLine());
         height = Double.parseDouble(scanUser.nextLine());
         ConicalFrustum conFr =
            new ConicalFrustum(label, radius1, radius2, height);
         coFruList.add(conFr);
      }
 
      ConicalFrustumList conFruList = 
         new ConicalFrustumList(cFName, coFruList);
      return conFruList;
   }
   
   /**
    */
   
   public void addConicalFrustum(String label, double radius1
      , double radius2, double height){
         ConicalFrustum cc 
            = new ConicalFrustum(label, radius1, radius2, height);
         conFruList.add(cc);
      }
      
   public ConicalFrustum findConicalFrustum(String labelIn){
      for(ConicalFrustum cFL: conFruList){
            if (cFL.getLabel().equalsIgnoreCase(labelIn))
               return cFL;
         }
      return null;
      }
   
   public ConicalFrustum deleteConicalFrustum(String labelIn){
      ConicalFrustum cF;
      for(int i = 0; i < conFruList.size(); i++){
         if (conFruList.get(i).getLabel().equalsIgnoreCase(labelIn)){
            cF = conFruList.get(i);
            conFruList.remove(i);
            return cF;
         }
      }
      return null;
   }
   
   public boolean editConicalFrustum(String label, double radius1
      , double radius2, double height){
      boolean tf = false;
      for(ConicalFrustum cFL: conFruList){
         if (cFL.getLabel().equals(label)){
            cFL.setRadius1(radius1);
            cFL.setRadius2(radius2);
            cFL.setHeight(height);
            tf = true;
            return tf;
         }
      }
      return tf;
   }
/**
 *@return the to string mathod.
 */
   public String toString() {
      String coFrListStr = "";
      int i = 0;
      coFrListStr = conFruStr
         + "\n"
         + "\n";
      while (i < conFruList.size()) {
         coFrListStr += conFruList.get(i).toString() 
            + "\n";
         i++;
      }
      return coFrListStr;
   }
   /**
    *@return summary Information
    */
   public String summaryInfo() {
      DecimalFormat ff = new DecimalFormat("#,##0.0##");
      String summaryInfo;
      summaryInfo = "----- Summary for " 
         + conFruStr 
         + " -----\n"
         + "Number of ConicalFrustum Objects: "
         + numberOfConicalFrustums()
         + "\n"
         + "Total Surface Area: "
         + ff.format(totalSurfaceArea())
         + "\n"
         + "Total Volume: "
         + ff.format(totalVolume())
         + "\n"
         + "Average Surface Area: "
         + ff.format(averageSurfaceArea())
         + "\n"
         + "Average Volume: "
         + ff.format(averageVolume())
         + "\n";
      return summaryInfo;
   }
}


