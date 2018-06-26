import java.util.Comparator;
/** 	
  * the CostComparator.	
  * @author Boyang Yu
  * @version 04/16/2018
  */	
public class CostComparator implements Comparator<Bunny> {
   /**
    *@param b1 comparat.
    *@param b2 comparat obj.
    *@return bigger or smaller.
    */
   public int compare(Bunny b1, Bunny b2) {
      if (b1.estimatedMonthlyCost() > b2.estimatedMonthlyCost()) {
         return 1;
      }
      else if (b1.estimatedMonthlyCost() < b2.estimatedMonthlyCost()) {
         return -1;
      }
      return 0;
   }

}