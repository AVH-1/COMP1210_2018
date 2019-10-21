/**
*create a class called Scores that will hold an array of numerical values and
*provide methods that allow users to interact with the Scores class.
*Activity 7
*@author BoyangYu-COMP1210-001
*@version 03/05/2018
*/
public class Scores {
   
   private int[] numbers;
   /**
    *@param numbersIn the array that user give.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   /**
    *@return the evens numbers.
    */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
    *@return the odds numbers.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
    *@return the average of sum.
    */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return sum / numbers.length;
   }
   /**
    *@return the string for print.
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;   
   }
   /**
    *@return the sring in reverse.
    */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;   
   }
   

}