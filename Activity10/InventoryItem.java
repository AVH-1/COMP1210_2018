/**
 * Inventory item.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * @param nameIn user give.
    * @param priceIn user price.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * @return name.
    */
   public String getName() {
      return name;
   }
   /**
    * @return price.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    * @param taxRateIn set.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    * @return tostring.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}