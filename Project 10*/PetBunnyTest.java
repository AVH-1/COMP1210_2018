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
public class PetBunnyTest {
   

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** the test. 
    *@throws NegativeValueException  .
   **/
   @Test public void estimatedMonthlyCostTest()
      throws NegativeValueException {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals(6.48, pb1.estimatedMonthlyCost(), 0.01);
   }
   /** the test.
   *@throws NegativeValueException  .
    **/
   @Test public void toStringTest()
      throws NegativeValueException {
      
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("toString test", true,
         pb1.toString().contains("Floppy"));
   }
   /** the test.
   *@throws NegativeValueException  .
    **/
   @Test public void gettersTest()
      throws NegativeValueException {
      
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("Floppy", pb1.getName());
      Assert.assertEquals("Holland Lop", pb1.getBreed());
      Assert.assertEquals(3.5, pb1.getWeight(), 0.01);
   }
   /** the test.
   *@throws NegativeValueException  .
    **/
   @Test public void settersTest()
      throws NegativeValueException {
      
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setName("a");
      pb1.setBreed("b");
      pb1.setWeight(1.0);
      pb1.resetBunnyCount();
      Assert.assertEquals("a", pb1.getName());
      Assert.assertEquals("b", pb1.getBreed());
      Assert.assertEquals(1.0, pb1.getWeight(), 0.01);
      Assert.assertEquals(0, pb1.getBunnyCount());
   }
   /** the test. 
   *@throws NegativeValueException  .
   **/
   @Test public void equalsTest()
      throws NegativeValueException {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);     
      PetBunny pb2 = new PetBunny("Floppy", "Holland Lop", 3.5);    
      PetBunny pb3 = new PetBunny("F", "Holland Lop", 3.5);
      PetBunny pb4 = new PetBunny("Floppy", "H", 3.5);
      PetBunny pb5 = new PetBunny("Floppy", "Holland Lop", 1.3);
      Assert.assertEquals("", true, pb1.equals(pb2));
      Assert.assertEquals("", false, pb1.equals("string"));
      Assert.assertEquals("", false, pb1.equals(pb3));
      Assert.assertEquals("", false, pb1.equals(pb4));
      Assert.assertEquals("", false, pb1.equals(pb5));
      Assert.assertEquals("", 0, pb1.hashCode());
   }
   /** the test.
   *@throws NegativeValueException  .
    **/
   @Test public void compareTo()
      throws NegativeValueException {
      
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals(0, pb1.compareTo(pb1));
   }  
}
