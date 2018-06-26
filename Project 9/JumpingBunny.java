/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */
public class JumpingBunny extends Bunny {
/**
 *@param trainingCost use give.
 *@param BASE_COST is base cost.
 */
   private double trainingCost;
   /**
    *@param BASE_COST is base cost.
    */
   public static final double BASE_COST = 2.50;
/**
 *@param nameIn name user give.
 *@param breedIn breed that the user give.
 *@param weightIn weight user give.
 *@param trainingCostIn training cost user give.
 */
   public JumpingBunny(String nameIn, String breedIn,
      double weightIn, double trainingCostIn) {
      super(nameIn, breedIn, weightIn);
      trainingCost = trainingCostIn;
   }
/**
 *@return trainingCost user give.
 */
   public double getTrainingCost() {
      return trainingCost;
   }
/**
 *@param trainingCostIn trainingCost user give.
 */
   public void setTrainingCost(double trainingCostIn) {
      trainingCost = trainingCostIn;
   }
   /**
    *@return the estimated cost.
    */ 
   public double estimatedMonthlyCost() {
      return BASE_COST * weight + trainingCost;
   }
   /**
    *@return the to string.
    */
   public String toString() {
      java.text.DecimalFormat df = new java.text.DecimalFormat("$#,##0.00");
      return super.toString() 
         + " (includes "
         + df.format(trainingCost)
         + " for training)";
   }

}