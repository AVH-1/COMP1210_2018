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

public class JumpingBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** the test. **/
   @Test public void getTrainingCostTest() {
   
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals(25.0, jb1.getTrainingCost(), 0.01);
      
   }
   /** the test. **/
   @Test public void setTrainingCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      jb1.setTrainingCost(1.0);
      Assert.assertEquals(1.0, jb1.getTrainingCost(), 0.01);
   
   }
   /** the test. **/
   @Test public void estimatedMonthlyCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals(40.75, jb1.estimatedMonthlyCost(), 0.01);
   
   }
   /** the test. **/
   @Test public void toStringTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("toString test", true,
         jb1.toString().contains("Speedy"));
   }
}
