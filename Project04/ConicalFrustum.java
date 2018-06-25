import java.text.DecimalFormat;
/**
*calculate for a Conical Frustum.
*Porject 4
*@author BoyangYu-COMP1210-001
*@version 02/05/2018
*/
public class ConicalFrustum {
   //Declare variables.
   private String label = "";
   private double radius1 = 0.0;
   private double radius2 = 0.0;
   private double height = 0.0;
   //constracter
   /**
    *@param labelIn is label name that user give.
    *@param radius1In is radius1 that user give.
    *@param radius2In is radius2 that user give.
    *@param heightIn is height that user give.
    */
   public ConicalFrustum(
      String labelIn, double radius1In, double radius2In, double heightIn
   ) {
      setLabel(labelIn);
      setRadius1(radius1In);
      setRadius2(radius2In);
      setHeight(heightIn);
   }
   /**
   *@return a string that give all variable.
   */
   public String toString() {
      
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String output = "ConicalFrustum \"" 
         + label
         + "\" with radius1 = " 
         + radius1
         + ", radius2 = "
         + radius2
         + ", and height = "
         + height
         + " has:"
         + "\n";
      output += "\t" 
         + "volume = " 
         + df.format(volume())
         + " cubic units"
         + "\n";
      output += "\tslant height = " 
         + df.format(slantHeight())
         + " units\n";
      output += "\tlateral surface area = " 
         + df.format(lateralSurfaceArea())
         + " units"
         + "\n";
      output += "\ttotal surface area = "
         + df.format(totalSurfaceArea())
         + " square units"
         + "\n";
      return output;
   }
   /**
    *@return conical frustum volume.
    */
   public double volume() {
      double volume = ((Math.PI * height) / 3) * (Math.pow(radius1, 2) 
         + Math.pow(radius2, 2) + (radius1 * radius2));
      return volume;
   }
   /**
    *@return conical frustum slant height.
    */
   public double slantHeight() {
      double slantHeight;
      slantHeight = Math.sqrt(Math.pow((radius1 - radius2), 2) 
      + Math.pow(height, 2));
      return slantHeight;
   }
   /**
    *@return conical frustum lateral surfaceArea.
    */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea;
      lateralSurfaceArea = Math.PI * (radius1 + radius2) * slantHeight();
      return lateralSurfaceArea; 
   }
   /**
    *@return conical frustum totall surface area.
    */
   public double totalSurfaceArea() {
      double totallSurfaceArea;
      totallSurfaceArea = Math.PI 
         * (Math.pow(radius1, 2) + Math.pow(radius2, 2) + (radius1 + radius2)
         * slantHeight());
      return totallSurfaceArea;
   }
   /**
    *@return get private label
    */
   public String getLabel() { 
      return label;
   }
   /**
    *@param setLabelIn user give change label vulae.
    *@return if the label change.
    */
   public boolean setLabel(String setLabelIn) {
      boolean isSet = false;
      if (setLabelIn != null) {
         label = setLabelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
    *@return private radius1.
    */
   public double getRadius1() {
      return radius1;
   }
   /**
    *@param setRadius1In radius1 that user change.
    *@return if the radius1 been changed.
    */
   public boolean setRadius1(double setRadius1In) { 
      boolean isSet = false;
      if (setRadius1In > 0) {
         radius1 = setRadius1In;
         isSet = true;
      }
      return isSet;
   }
   /**
    *@return private.
    */
   public double getRadius2() { 
      return radius2;
   }
   /**
    *@param serRadius2In radius2 that user give.
    *@return if radius2 been changed.
    */
   public boolean setRadius2(double serRadius2In) {
      boolean isSet = false;
      if (serRadius2In > 0) {
         radius2 = serRadius2In;
         isSet = true;
      }
      return isSet;
   }
   /**
    *@return private height.
    */
   public double getHeight() {
      return height;
   }
   /**
    *@param setHeightIn user change height.
    *@return if the height has been changed.
    */
   public boolean setHeight(double setHeightIn) {
      boolean isSet = false;
      if (setHeightIn > 0) {
         height = setHeightIn;
         isSet = true;
      }
      return isSet;
   }
}