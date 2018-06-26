/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */

public class PetBunny extends Bunny {
/**
 *@param BASE_COST the base cost.
 */
   public static final double BASE_COST = 1.85;
/**
 *@param nameIn name user give.
 *@param breedIn breed that the user give.
 *@param weightIn weight user give.
 */
   public PetBunny(String nameIn, String breedIn, double weightIn) {
      super(nameIn, breedIn, weightIn);
      
   }
   /**
    *@return the cost.
    */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight;
   }
   /**
    *@return the to string.
    */
   public String toString() {
      return super.toString();
   }


}