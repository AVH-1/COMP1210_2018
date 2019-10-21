import java.text.DecimalFormat;
/**
 *use class and methods.
 *Activity 4
 *@author BoyangYu-COMP1210-001
 *@version 02/05/2018
 */
public class UserInfoDriver  {
   /**
    *new UserInfo type print and add information.
    *@param args Command line arguments – not used.
    */
   public static void main(String[] args) {
      //UserInfo user1 = new UserInfo("pat", "Doe");
      //user1
   //initializate a variable type of UserInfo.
      UserInfo user1 = new UserInfo("Pat", "Doe");
      //add info
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      //print
      System.out.println("\n" + user1);
   //initializate anthor variable.
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      //print.
      System.out.println("\n" + user2);
      
      
   }
}
   
