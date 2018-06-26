/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */
public class HouseBunny extends PetBunny {
   /**
    *@param wearAndTear user give.
    *@param BASE_COST base cost.
    */
   private double wearAndTear;
   /**
    *@param BASE_COST base cost.
    */
   public static final double BASE_COST = 2.25;
/**
 *@param nameIn name user give.
 *@param breedIn breed that the user give.
 *@param weightIn weight user give.
 *@param wearAndTearIn wearAndTear user give.
 *@throws NegativeValueException throws tag the.
 */
   public HouseBunny(String nameIn, String breedIn,
      /**
       *
       *
       */
      double weightIn, double wearAndTearIn)
      throws NegativeValueException 
   {
         super(nameIn, breedIn, weightIn);
         
      if (wearAndTearIn < 0) {
         
         bunnyCount--;
         throw new NegativeValueException();
            
      }
      
      
      wearAndTear = wearAndTearIn;
      
   }
   /**
    *@return the wearand tear.
    */
   public double getWearAndTear() {
      return wearAndTear;
   }
   /**
    *@param wearAndTearIn user give.
    */
   public void setWearAndTear(double wearAndTearIn) {
      wearAndTear = wearAndTearIn;
   }
   /**
    *@return the cost.
    */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight * (1 + wearAndTear);
   }
   /**
    *@return the tostring.
    */
   public String toString() {
      java.text.DecimalFormat df2 = new java.text.DecimalFormat("0.0");
      double aa;
      aa = wearAndTear * 100;
      return super.toString() 
         + " (includes " 
         + df2.format(aa)
         + "% for wear and tear)";
   }
   
                                 
} 