/**
 *Conditionals and Loops for comp1210.
 *Activity 5
 *@author BoyangYu-COMP1210-001
 *@version 02/19/2018
 */
public class NumberOperations {
   private int number;
   /**
    *@param numberIn is number user give
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
    *@return to get number.
    */
   public int getValue()
   {
      return number;
   }
   /**
    *@return caculate for odds.
    */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    *@return give that power two under.
    */
   public String powersTwoUnder()
   {
      String output = ""; 
      String initialize = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    *@return if nuber Greater is 1, leass 2, equel 0.
    *@param compareNumber that user want to compare.
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    *@return number.
    */
   public String toString()
   {
      return number + "";
   }
   
}
   