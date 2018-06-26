import java.util.Scanner;
//import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Conical Frustum List App.
 */
public class ConicalFrustumList2 {
   private int numberOfConicalFrustums;
   private ConicalFrustum[] conFruList;
   private String conFruStr;
/**
 * @param conFruListIn user give.
 * @param conFruStrIn user give.
 * @param numberOfConicalFrustumsIn user give.
 */
   public ConicalFrustumList2(String conFruStrIn,
       ConicalFrustum[] conFruListIn, int numberOfConicalFrustumsIn
   ) {
      conFruList = conFruListIn;
      conFruStr = conFruStrIn;
      numberOfConicalFrustums = numberOfConicalFrustumsIn;
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
      return numberOfConicalFrustums;
   }
/**
 *@return total surface area
 */
   public double totalSurfaceArea() {
      int i = 0;
      double d = 0;
      while (i < numberOfConicalFrustums) {
         d += conFruList[i].totalSurfaceArea();
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
      while (i < numberOfConicalFrustums) {
         d += conFruList[i].volume();
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
      if (numberOfConicalFrustums == 0) {
         return d;
      }
      else {
         while (i < numberOfConicalFrustums) {
            d += conFruList[i].totalSurfaceArea();
            i++;
         }

         d /= numberOfConicalFrustums;
         return d;
      }
   }
/**
 *@return average volume.
 */
   public double averageVolume() {
      int i = 0;
      double d = 0.0;
      if (numberOfConicalFrustums == 0) {
         return d;
      }
      else {
         while (i < numberOfConicalFrustums) {
            d += conFruList[i].volume();
            i++;
         }
         d /= numberOfConicalFrustums;
         return d;
      }
   }
   /**
    *@return the conical frustum list in the class.
    */
   public ConicalFrustum[] getList() {
      return conFruList;
   }
   /**
    *@param fileNameIn is the file name the user enter.
    *@return a conical frustum list use file name.
    *@throws FileNotFoundException for data file.
    */
   public ConicalFrustumList2 readFile(String fileNameIn)
      throws FileNotFoundException {
      
      String label, cFName;
      double radius1, radius2, height;
      Scanner scanUser = new Scanner(new File(fileNameIn));
      ConicalFrustum[] coFruList
         = new ConicalFrustum[20];
         
      cFName = scanUser.nextLine();
      
      while (scanUser.hasNext()) {
         label = scanUser.nextLine();
         radius1 = Double.parseDouble(scanUser.nextLine());
         radius2 = Double.parseDouble(scanUser.nextLine());
         height = Double.parseDouble(scanUser.nextLine());
         ConicalFrustum conFr =
            new ConicalFrustum(label, radius1, radius2, height);
         coFruList[numberOfConicalFrustums] = conFr;
         numberOfConicalFrustums++;
      }
 
      ConicalFrustumList2 cosFruList = 
         new ConicalFrustumList2(cFName, coFruList, numberOfConicalFrustums);
      return cosFruList;
   }
   
   /**
    *@param label that user use app import file to give.
    *@param radius1 that user use app import file to give.
    *@param radius2 that user use app import file to give.
    *@param height that user use app import file to give.
    */
   
   public void addConicalFrustum(String label, double radius1,
      double radius2, double height) {
      ConicalFrustum cc 
            = new ConicalFrustum(label, radius1, radius2, height);
      conFruList[numberOfConicalFrustums] = cc;
      numberOfConicalFrustums++;
   }
      /**
       *@param labelIn that user enter.
       *@return the list.
       */
   public ConicalFrustum findConicalFrustum(String labelIn) {
      ConicalFrustum cFL = null;
      for (int i = 0; i < numberOfConicalFrustums; i++) {
         if (conFruList[i].getLabel().equalsIgnoreCase(labelIn)) {
            cFL = conFruList[i];
            break;
         }
  
      }
      return cFL;
   }
          
   /**
    *@return the list.
    *@param labelIn that user enter.
    */
   public ConicalFrustum deleteConicalFrustum(String labelIn) {
      ConicalFrustum cF = null;
      for (int i = 0; i < numberOfConicalFrustums; i++) {
         if (conFruList[i].getLabel().equalsIgnoreCase(labelIn)) {
            cF = conFruList[i];
            for (int s = i; s < numberOfConicalFrustums - 1; s++) {
               conFruList[s] = conFruList[s + 1];
            }
            conFruList[numberOfConicalFrustums - 1] = null;
            numberOfConicalFrustums--;
            break;
         }
      }
      return cF;
   }
   /**
    *@param label that user enter.
    *@param radius1 that user enter.
    *@param radius2 that user enter.
    *@param height that user enter.
    *@return if the list have been change.
    */
   public boolean editConicalFrustum(String label, double radius1, 
      double radius2, double height) {
      ConicalFrustum cF = null;
      boolean tf = false;
      for (int i = 0; i < numberOfConicalFrustums; i++) {
         if (conFruList[i].getLabel().equalsIgnoreCase(label)) {
            cF = conFruList[i];
            conFruList[i].setRadius1(radius1);
            conFruList[i].setRadius2(radius2);
            conFruList[i].setHeight(height);
            tf = true;
            return tf;
         }
      }
      return tf;
   }
   /**
    *@return if is the least height.
    */
   public ConicalFrustum findConicalFrustumWithLeastHeight() {
      if (numberOfConicalFrustums <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfConicalFrustums; j++) {
         if (conFruList[j].getHeight() <= conFruList[i].getHeight()) {
            i = j;
         }
      }
      return conFruList[i];
   }
   /**
    *@return if is the greatest hight.
    */
   
   public ConicalFrustum findConicalFrustumWithGreatestHeight() {
      if (numberOfConicalFrustums <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfConicalFrustums; j++) {
         if (conFruList[j].getHeight() > conFruList[i].getHeight()) {
            i = j;
         }
      }
      return conFruList[i];
   }
   /**
    *@return the least volume.
    */
   public ConicalFrustum findConicalFrustumWithLeastVolume() {
      if (numberOfConicalFrustums <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfConicalFrustums; j++) {
         if (conFruList[j].volume() <= conFruList[i].volume()) {
            i = j;
         }
      }
      return conFruList[i];
   }
   /**
    *@return the greatest volume.
    */
   public ConicalFrustum findConicalFrustumWithGreatestVolume() {
      if (numberOfConicalFrustums <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfConicalFrustums; j++) {
         if (conFruList[j].volume() > conFruList[i].volume()) {
            i = j;
         }
      }
      return conFruList[i];
   }
   
   
/**
 *@return the to string mathod.
 */
   public String toString() {
      String coFrListStr = conFruStr + "\n";
      int i = 0;
      while (i < numberOfConicalFrustums) {
         coFrListStr += "\n" + conFruList[i] + "\n";
         i++;
      }
      return conFruStr + "\n" + coFrListStr;
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


