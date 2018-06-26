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
public class BunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** **/
   @Test public void gettersTest() {
      Bunny by1 = new Bunny("Spot", "Really Mixed", 5.8);
      Assert.assertEquals("Spot", by1.getName());
      Assert.assertEquals("Really Mixed", by1.getBreed());
      Assert.assertEquals(5.8, by1.getWeight(), 0.01);
   }

}
