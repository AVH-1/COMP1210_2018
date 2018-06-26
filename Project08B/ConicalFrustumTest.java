import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *project8.
 *
 *@author Boyang Yu
 *@version 03/23/2018
 */

public class ConicalFrustumTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void gettersTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals("Small", cF.getLabel());
      Assert.assertEquals(0.5, cF.getRadius1(), 0.01);
      Assert.assertEquals(0.75, cF.getRadius2(), 0.01);
      Assert.assertEquals(0.25, cF.getHeight(), 0.01);
   }
   /**
    *setters are coret.
    */
   @Test public void settersTest() {
      ConicalFrustum cF = new ConicalFrustum("Smalla", 0.55, 0.755, 0.255);
      cF.setLabel("Small");
      cF.setRadius1(0.5);
      cF.setRadius2(0.75);
      cF.setHeight(0.25);
      Assert.assertEquals("Small", cF.getLabel());
      Assert.assertEquals(0.5, cF.getRadius1(), 0.01);
      Assert.assertEquals(0.75, cF.getRadius2(), 0.01);
      Assert.assertEquals(0.25, cF.getHeight(), 0.01);
   }
   /** volume test.**/
   @Test public void volumeTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(0.311, cF.volume(), 0.001);
   }
   /** slantHeight test. **/
   @Test public void slantHeightTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(0.354, cF.slantHeight(), 0.001);
   }
   /** lateralSurfaceArea Test. **/
   @Test public void lateralSurfaceAreaTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(1.388, cF.lateralSurfaceArea(), 0.001);
   }
   /** totalSurfaceArea Test. **/
   @Test public void totalSurfaceAreaTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(3.941, cF.totalSurfaceArea(), 0.001);
   }
   /** toString Test. **/
   @Test public void toStringTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals("toString test", true,
         cF.toString().contains("ConicalFrustum \"Small\""));
   }
   /** count Test. **/
   @Test public void countTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF.resetCount();
      ConicalFrustum cF1 = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(1, cF1.getCount());
   }
   /** equals Test. **/
   @Test public void equalsTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      ConicalFrustum cF1 = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals("", true, cF.equals(cF1));
      ConicalFrustum cF2 = new ConicalFrustum("bb", 0.5, 0.75, 0.25);
      Assert.assertEquals("false test", false, cF.equals(cF2));
      ConicalFrustum cF3 = new ConicalFrustum("Small", 0.1, 0.75, 0.25);
      Assert.assertEquals("false test", false, cF.equals(cF3));
      ConicalFrustum cF4 = new ConicalFrustum("Small", 0.5, 0.1, 0.25);
      Assert.assertEquals("false test", false, cF.equals(cF4));
      ConicalFrustum cF5 = new ConicalFrustum("Small", 0.5, 0.75, 0.1);
      Assert.assertEquals("false test", false, cF.equals(cF5));
      Assert.assertEquals("false test", false, cF.equals(""));
      Assert.assertEquals("false test", 0, cF.hashCode());
   }
   /** hashCode Test. **/
   @Test public void hashCodeTest() {
      ConicalFrustum cF = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(0, cF.hashCode());
   }
   /** setters test that always false. **/
   @Test public void settersFalseTest() {
      ConicalFrustum cF = new ConicalFrustum(null, -1, -1, -1);
      cF.setLabel(null);
      cF.setRadius1(-1);
      cF.setRadius2(-1);
      cF.setHeight(-1);
      Assert.assertEquals("", cF.getLabel());
      Assert.assertEquals(0.0, cF.getRadius1(), 0.01);
      Assert.assertEquals(0.0, cF.getRadius2(), 0.01);
      Assert.assertEquals(0.0, cF.getHeight(), 0.01);
   }
}
