import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 	
  * bunniesPart3.	
  * @author Buyang Yu_COMP1210
  * @version 04/26/2018
  */
  
public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
      try {
         HouseBunny hb = new HouseBunny("Spot", "Mixed", -0.08); }
      catch (NegativeValueException e) { thrown = true;
         }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown); /* or alternatively: */
      Assert.assertEquals("Expected NegativeValueException to be thrown.", true, thrown);
         }
}
