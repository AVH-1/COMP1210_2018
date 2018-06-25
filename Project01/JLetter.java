/**
 *Use for loop to print letter block J.
 *
 *Project 01
 *@author BoyangYu-COMP1210-001
 *@version 01/18/2018
 */
public class JLetter {
   /**
    *Use for loop to print half of letter and other use simple print.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
     //Declare variables
      String a = "JAVA";
      String b = "      ";
       //Use double for loop to simple print 3 times and 2 rows "JAVA"
      for (int ii = 0; ii < 2; ii++) {
         for (int i = 0; i < 3; i++) {
         
            System.out.print(a);
         }
         System.out.println();
      }
      //Use for loop print "      JAVA" 4 times
      for (int ii = 0; ii < 4; ii++)
      {
         System.out.println(b + a);
      }
      //Simple print other
      System.out.println("J     " + a);
      System.out.println("JA    " + a);
      System.out.println(" " + a + a);
      System.out.println("  " + a + "JA");
   }
}