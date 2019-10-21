/**
*Pccept coded ticket information to another time and place.
*Activity 4
*@author BoyangYu-COMP1210-001
*@version 02/05/2018
*/
public class UserInfo {
   // instance variables
   private static final int OFFLINE = 0, ONLINE = 1;
   private String firstName;
   private String lastName, location;
   private int age, status;
   // constructor
   /**
   * @param firstNameIn is the user give the first name.
   * @param lastNameIn is the user give the last name.
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
      
   }
   /**
   *@return a string give all info.
   */
   public String toString() {
      String output = "Name: " 
         + firstName 
         + " "
         + lastName
         + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else { 
         output += "Online";
      }
      return output;
      
   }
   /**
    *@param locationIn is user give location.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
  /**
   *@param ageIn is age that user give.
   *@return boolean that if user give age.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) { //if not give value
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
/**
 *@return age.
 */
   public int getAge() {
      return age;
   }
/**
 *@return location.
 */
   public String getLocation() {
      return location;
   }
/**   
 *change status to OFFLINE.
 */
   public void logOff() {
      status = OFFLINE;
   }
/**
 *change status to ONLINE.
 */
   public void logOn() {
      status = ONLINE;
   }

}
