import java.util.ArrayList;
/**
 *In this activity you will create two classes. Temperatures will hold a set 
 *of integer values representing daily temperatures. TemperatureInfo will 
 *allow users to interact with the Temperatures class.
 *
 *@author Boyang Yu
 *@version 02/23/2018
 */
public class Temperatures {
   private ArrayList<Integer> temperatures;
   /**
    *@param temperaturesIn user give.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**
    *@return the lower temp
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
    *@return higher temp.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp: temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
    *@param lowIn user enter.
    *@return if the in is lower.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    *@param highIn higher user enter.
    *@return if the highIn is higher
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    *@return To string.
    */
   public String toString() {
      return "   Temperatures: " 
         + temperatures
         + "\n\tLow: " 
         + getLowTemp()
         + "\n\tHigh: " 
         + getHighTemp();
   }
}