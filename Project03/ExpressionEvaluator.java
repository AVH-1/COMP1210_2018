import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *Calculate the expression for a value x.
 *Porject 3
 *@author BoyangYu-COMP1210-001
 *@version 01/29/2018
 */
public class ExpressionEvaluator  {
   /**
    *user enter x and print result.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
   //Declare variables
      Scanner userInput = new Scanner(System.in);
      double x, y, result;
      String resultStr;
      int  lPoint, rPoint;
      //pomp the user enter x
      System.out.println("Enter a value for x: ");
      x = userInput.nextDouble();
      //use fomuler to proess x to get result
      result = Math.pow(x, 10);
      result = 10.4 * result - (x - 1);
      result = Math.abs(result);
      result = Math.sqrt(result);
      result /= (3.5 * Math.pow(x, 4)) 
         + (2.5 * Math.pow(x, 2))
         + (1.5 * x)
         + 0.5;
      //print result
      System.out.println("Result: " + result);
      //translate double to string
      resultStr = Double.toString(result);
      lPoint = resultStr.indexOf(".");
      rPoint = resultStr.length() - lPoint - 1;
      //print lpoint and rpoint
      System.out.println("# digits to left of decimal point: " + lPoint);
      System.out.println("# digits to right of decimal point: " + rPoint);
      //new decimalFormat
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      resultStr = df.format(result);
      //print the format result
      System.out.println("Formatted Result: " + resultStr);
   }
}