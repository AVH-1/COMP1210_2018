/**
 * Division.
 *
 * Activity11.
 * @author Boyang Yu
 * @version 04/16/2018
 */
public class Division {
   /**
    * @param numerator .
    * @param denominator .
    * @return .
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   /**
    * @param numerator .
    * @param denominator .
    * @return .
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator " 
            + "cannot be zero.");
      }
      return (double) numerator / denominator;
   }
}