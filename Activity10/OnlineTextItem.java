/**
 * Online text item.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public abstract class OnlineTextItem extends InventoryItem {
   /**
    * @param nameIn user give.
    * @param priceIn input price.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /**
    * @return price.
    */
   public double calculateCost() {
      return price;
   }
}