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
public class HouseBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** the test. **/
   @Test public void getWearAndTearTest() {
   
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals(0.15, hb1.getWearAndTear(), 0.15);
      
   }
   /** the test. **/
   @Test public void setWearAndTearTest() {
   
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      hb1.setWearAndTear(1.0);
      Assert.assertEquals(1.0, hb1.getWearAndTear(), 0.01);
      
   }
   /** the test. **/
   @Test public void estimatedMonthlyCostTest() {
   
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals(15.01, hb1.estimatedMonthlyCost(), 0.01);
   }
   /** the test. **/
   @Test public void toStringTest() {
   
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("toString test", true,
         hb1.toString().contains("Spot"));
      
   }
   

}
