/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */
public abstract class Bunny implements Comparable<Bunny> {
/**
 *@param name name user give.
 *@param breed breed that the user give.
 *@param weight weight user give.
 */
   protected String name, breed;
   protected double weight;
   protected static int bunnyCount = 0;
/**
 *@param nameIn name user give.
 *@param breedIn breed that the user give.
 *@param weightIn weight user give.
 *@throws NegativeValueException  .
 */
   public Bunny(String nameIn, String breedIn, 
      double weightIn)
      throws NegativeValueException 
   {
      if (weightIn < 0) {
         throw new NegativeValueException();
      }
      
      
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      bunnyCount++;
   }
/**
 *@return the name.
 */
   public String getName() {
      return name;
   }
   /**
    *@return the breed.
    */
   public  String getBreed() {
      return breed;
   }
   /**
    *@return the weight.
    */
   public double getWeight() {
      return weight;
   }
   /**
    *@param nameIn user give.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /**
    *@param breedIn user give.
    */
   public void setBreed(String breedIn) {
      breed = breedIn;
   }
   /**
    *@param weightIn user give.
    */
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
   /**
    *@return bunnyCount.
    */
   public static int getBunnyCount() {
      return bunnyCount;
   }
   /**
    *set bunnyCount.
    */
   public static void resetBunnyCount() {
      bunnyCount = 0;
   }
   /**
    *monthly cost.
    *@return the cost.
    */
   public abstract double estimatedMonthlyCost();
   /**
    *@return the tostring mathod.
    */
   public String toString() {
      java.text.DecimalFormat df = new java.text.DecimalFormat("$#,##0.00");
      java.text.DecimalFormat df2 = new java.text.DecimalFormat("0.0");
   
      String str = "";
      str = name 
         + " (" 
         + this.getClass().getName() 
         + ")   "
         + "Breed: "
         + breed
         + "   Weight: "
         + df2.format(weight);
         
      str += "\nEstimated Monthly Cost: "
         + df.format(estimatedMonthlyCost());
         
      return str;
   }
   /**
    *@param obj user give.
    *@return the test.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Bunny)) {
         return false;
      }
      else {
         Bunny b = (Bunny) obj;
         return (name.equalsIgnoreCase(b.getName())
            && breed.equalsIgnoreCase(b.getBreed())
            && Math.abs(weight - b.getWeight()) < .000001);
      }
   }
   /**
    *@return 0.
    */
   public int hashCode() {
      return 0;
   }
   /**
    *@param bun user give.
    *@return name.
    */
   public int compareTo(Bunny bun) {
   
      return this.name.compareTo(bun.name);
   
   }
   
} 
