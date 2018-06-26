import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *project9.
 *
 *@author Boyang Yu
 *@version 04/04/2018
 */
public class ShowBunnyTest {
/** the test. **/
   @Before public void setUp() {
   }
   /** the test. **/
   @Test public void gettersTest() {
   
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals(22.0, sb1.getGroomingCost(), 0.01);
      
   }
/** the test. **/
   @Test public void setGroomingCostTest() {
   
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      sb1.setGroomingCost(1.0);
      Assert.assertEquals(1.0, sb1.getGroomingCost(), 0.01);
      
   }
   /** the test. **/
   @Test public void estimatedMonthlyCostTest() {
   
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals(62.15, sb1.estimatedMonthlyCost(), 0.01);
      
   }
   /** the test. **/
   @Test public void toStringTest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals("toString test", true,
         sb1.toString().contains("Bigun"));
   }

}
