/**
 * The driver.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public class InventoryApp {
   /**
    * The driver class of InventoryItem.
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args) {
   
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      item1.setTaxRate(0.05);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   }
}