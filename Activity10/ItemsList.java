/**
 * Items list class.
 *
 * Activity10.
 * @author Boyang Yu
 * @version 4/09/2018
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * constrater variable .
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
    * @param itemIn .
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
    * @param electronicsSurcharge .
    * @return .
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   /**
    * @return .
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}