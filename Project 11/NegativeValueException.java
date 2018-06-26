public class NegativeValueException extends Exception {
   public NegativeValueException() {
      super("Numeric values must be nonnegative");
   }
   
}