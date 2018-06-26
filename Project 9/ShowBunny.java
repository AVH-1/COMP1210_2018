/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */
public class ShowBunny extends Bunny {
/**
 *@param groomingCost grooming cost.
 */
   private double groomingCost;
   /**
    *@param BASE_COST the base cost.
    */

   public static final double BASE_COST = 2.75;
/**
 *@param nameIn name user give.
 *@param breedIn breed that the user give.
 *@param weightIn weight user give.
 *@param groomingCostIn grooming cost user give.
 */
   public ShowBunny(String nameIn, String breedIn,
      double weightIn, double groomingCostIn) {
      
      super(nameIn, breedIn, weightIn);
      groomingCost = groomingCostIn;
      
   }
/**
 *@return the cost.
 */
   public double getGroomingCost() {
      return groomingCost;
   }
/**
 *@param groomingCostIn user give.
 */
   public void setGroomingCost(double groomingCostIn) {
      groomingCost = groomingCostIn;
   } 
   /**
    *@return the cost.
    */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight + groomingCost;
   }
   /**
    *@return the to string.
    */
   public String toString() {
      java.text.DecimalFormat df = new java.text.DecimalFormat("$#,##0.00");
      return super.toString()
         + " (includes "
         + df.format(groomingCost)
         + " for grooming)";
   }
}