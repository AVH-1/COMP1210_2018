/**
 *Aictivity8.
 *
 *@author Boyang Yu
 *@version 03/26/2018
 */
public class Customer {

   private String name, location;
   private double balance;
/**
 *@param nameIn user give.
 */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
/**
 *@param locationIn user give.
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * @param city the user give.
    * @param state the user give.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
   * @param amount user give.
   */
   public void changeBalance(double amount) {
      balance = balance + amount;
   }
   /**
    * @return the location.
    */
   public String getLocation() {
      return location;
   }
    /**
    * @return the balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * @return give output string.
    */
   public String toString() {
      String output = name;
      output += "\n" + location;
      output += "\n$" + balance;
      return output;
   }
   /**
    * @param obj a new object.
    * @return the result of comparison.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}