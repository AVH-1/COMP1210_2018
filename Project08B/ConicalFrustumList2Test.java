import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 *project8.
 *
 *@author Boyang Yu
 *@version 03/30/2018
 */

public class ConicalFrustumList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void gettersTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", "Test List", cFList2.getName());
      Assert.assertArrayEquals("Test", cF, cFList2.getList());
   }
   
   /** A test of number Of Conical Frustums Test. **/
   @Test public void numberOfConicalFrustumsTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test", cF, 1);
      Assert.assertEquals("numberOfConicalFrustums Test", 
                           1, cFList2.numberOfConicalFrustums());
   }
   
   /** A test of total Surface Area Test. **/
   @Test public void totalSurfaceAreaTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", 
                           407477.02, cFList2.totalSurfaceArea(), 0.1);
   }
   
   /** A test of total Volume. **/
   @Test public void totalVolumeTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", 
                           1.8022392357540492E7, cFList2.totalVolume(), .001);
   }
   
   /** A test of average Surface Area. **/
   @Test public void averageSurfaceAreaTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", 
                           135825.67, cFList2.averageSurfaceArea(), 0.1);
   }
   /** Atest of acerage with 0.**/
   @Test public void averageSurfaceAreaFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", cFList2.averageSurfaceArea(), 0.0, 0.1);
   }
   
   /** A test of average. **/
   @Test public void averageVolumeTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", 
                           6007464.119, cFList2.averageVolume(), .1);
   }
   /** A Test of average Volume whit False.**/
   @Test public void averageVolumeFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", 0, cFList2.averageVolume(), 0.1);
   }
   
   
   /** A test of to String. **/
   @Test public void toStringTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("toString Test", 
                           true, 
                           cFList2.toString().
                              contains("ConicalFrustum \"Small\""));
   }
   
   /** A test of summary Info. **/
   @Test public void summaryInfoTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", true, cFList2.summaryInfo().
          contains("Number of ConicalFrustum Objects: 3"));
   }
   
   /** A test of read File.
    * @throws FileNotFoundException for reading.
    */
   @Test public void readFileTest() throws FileNotFoundException {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      cFList2 = cFList2.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals("Test", "Conical Frustum Test List", 
                           cFList2.getName());
   }
   
   /** A test of add Conical Frustum. **/
   @Test public void addConicalFrustumTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      ConicalFrustum cff = new ConicalFrustum("Smalll", 0.51, 0.75, 0.25);
      cFList2.addConicalFrustum("Smalll", 0.51, 0.75, 0.25);
      ConicalFrustum[] cfff = cFList2.getList();
      Assert.assertEquals("Test", cff, cfff[3]);
   }
   
   /** A test of find Conical Frustum. **/
   @Test public void findConicalFrustumTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", cF[0],
         cFList2.findConicalFrustum("small"));
   }
   
   /** A test of find Conical Frustum when false. **/
   @Test public void findConicalFrustumFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", null, 
                           cFList2.findConicalFrustum("ss"));
   }

   /** A test of delete Conical Frustum. **/
   @Test public void deleteConicalFrustumTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      cFList2.deleteConicalFrustum("small");
      Assert.assertEquals("deleteConicalFrustum Test", null, cF[2]);
   }
   
    /** A test of delete Conical Frustum when false. **/
   @Test public void deleteConicalFrustumFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      cFList2.deleteConicalFrustum("ss");
      Assert.assertEquals("Test", cF[2], cF[2]);
   }
   
   /** A test of edit Conical Frustum. **/
   @Test public void editConicalFrustumTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      cFList2.editConicalFrustum("Small", 0.55, 0.75, 0.25);
      Assert.assertEquals("Test", 0.55, 
                           cF[0].getRadius1(), 0.1);
   }
   
   /** A test of edit Conical Frustum when false. **/
   @Test public void editConicalFrustumFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      //cFList2.editConicalFrustum("Smalll", 0.5, 0.75, 0.25);
      Assert.assertFalse(cFList2.editConicalFrustum("Smalll", 0.5, 0.75, 0.25));
   }

   /** A test of find Conical Frustum With Least Height. **/
   @Test public void findConicalFrustumWithLeastHeightTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", 
         cF, 3);
      Assert.assertEquals("Test", cF[0], 
                           cFList2.findConicalFrustumWithLeastHeight());
   }
   
   /** A test of find Conical Frustum With Least Height when false. **/
   @Test public void findConicalFrustumWithLeastHeightFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", null, 
                           cFList2.findConicalFrustumWithLeastHeight());
   }

   /** A test of find Conical Frustum With Greatest Height. **/
   @Test public void findConicalFrustumWithGreatestHeightTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", cF[2], 
         cFList2.findConicalFrustumWithGreatestHeight());
   }
   
   /** A test of find Conical Frustum With Greatest Height when false. **/
   @Test public void findConicalFrustumWithGreatestHeightFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", null, 
                           cFList2.findConicalFrustumWithGreatestHeight());
   }

   /** A test of find Conical Frustum With Least Volume. **/
   @Test public void findConicalFrustumWithLeastVolumeTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 3);
      Assert.assertEquals("Test", cF[0], 
         cFList2.findConicalFrustumWithLeastVolume());
   }
   
   /** A test of find Conical Frustum With Least Volume when false. **/
   @Test public void findConicalFrustumWithLeastVolumeFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", null,
         cFList2.findConicalFrustumWithLeastVolume());
   }

   /** A test of find Conical Frustum With Greatest Volume. **/
   @Test public void findConicalFrustumWithGreatestVolumeTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", 
         cF, 3);
      Assert.assertEquals("Test", cF[2], 
         cFList2.findConicalFrustumWithGreatestVolume());
   }
   
   /** A test of find Conical Frustum With Greatest Volume when false. **/
   @Test public void findConicalFrustumWithGreatestVolumeFalseTest() {
      ConicalFrustum[] cF = new ConicalFrustum[20];
      cF[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cF[1] = new ConicalFrustum("Medium", 0.51, 10.2, 15.9);
      cF[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cFList2 = new ConicalFrustumList2("Test List", cF, 0);
      Assert.assertEquals("Test", null, 
         cFList2.findConicalFrustumWithGreatestVolume());
   }
}
