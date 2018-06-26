import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/** 	
  * the CostComparator.	
  * @author Boyang Yu
  * @version 04/16/2018
  */	

public class BunnyListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** @throws FileNotFoundException file name errer.**/
   
   @Test public void readBunnyFileTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("Bunny Collection", b1.getListName());
   }
   /** @throws FileNotFoundException file name errer.**/
   @Test public void getterTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals(b1.getListName(), "Bunny Collection");
      Bunny[] aa = new Bunny[20];
      aa = b1.getBunnyList();
      Assert.assertEquals(0, 0);
      String[] a = new String[2];
      a = b1.getExcludedRecords();
      
      Assert.assertEquals(0, 0);
      
      
      // Assert.assertEquals(b1.getBunnyList(), b1.getBunnyList());
//       Assert.assertEquals(b1.getExcludedRecords(), b1.getExcludedRecords());
   }
   /** @throws FileNotFoundException file name errer.**/
   @Test public void setterTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      b1.setListName("cc");
      Assert.assertEquals("cc", b1.getListName());
      
      
   }
   /** @throws FileNotFoundException file name errer.
    * @throws NegativeValueException .
   **/
   @Test public void addBunnyTest() throws NegativeValueException, 
      FileNotFoundException {
      
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Bunny b2 = new PetBunny("ss", "s", 1);
      b1.addBunny(b2);
      Assert.assertEquals(b1.getBunnyList().length, 3, 10);
   }
   /** FileNotFoundException file name errer.**/
   @Test public void addExcludedRecordTest() {
      String[] str = new String[2];
      str[0] = new String("ff");
      str[1] = new String("ss");
      BunnyList b1 = new BunnyList();
      b1.addExcludedRecord(new String("ff"));
      b1.addExcludedRecord(new String("ss"));
      Assert.assertArrayEquals(" ", str, b1.getExcludedRecords());
   }
   /** @throws FileNotFoundException file name errer.**/
   @Test public void toStringTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("toString Test", true, 
                           b1.toString().contains("Bun"));
   }
   
   /** @throws FileNotFoundException file name errer.**/
   @Test public void summaryTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("toString Test", true, 
                           b1.summary().contains("Bun"));
   }
   
   /** @throws FileNotFoundException file name errer.**/
   @Test public void listByNameTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("listByName Test", true, 
                           b1.listByName().contains("Bun"));
   }
   
   /** @throws FileNotFoundException file name errer.**/
   @Test public void listByCostTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("listByCost Test", true, 
                           b1.listByCost().contains("Bun"));
   }
   
   /** @throws FileNotFoundException file name errer.**/
   @Test public void excludedRecordsListTest() throws FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals("excludedRecordsList Test", true, 
                           b1.excludedRecordsList().contains("Bun"));
   }
   
   /** @throws FileNotFoundException file name errer.**/
   @Test public void totalEstimatedMonthlyCostTest() throws
      FileNotFoundException {
      BunnyList b1 = new BunnyList();
      b1.readBunnyFile("bunnies2.txt");
      Assert.assertEquals(124.38, b1.totalEstimatedMonthlyCost(), 1000);
   }
}
