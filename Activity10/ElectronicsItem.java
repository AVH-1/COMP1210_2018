/**
 * Electronics item.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight = 0;
   /**
    * the cost user give.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * @param nameIn the name user give.
    * @param priceIn the price user give.
    * @param weightIn the weight user give.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    * @return the cost.
    */
   
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}