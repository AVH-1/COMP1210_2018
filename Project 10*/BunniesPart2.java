import java.io.FileNotFoundException;
/** 	
  * bunniesPart2.	
  * @author Buyang Yu_COMP1210
  * @version 04/16/2018
  */	
public class BunniesPart2 {
     /**
      * print.
      * @throws FileNotFoundException instet can not find the file.
      * @param args gets the file name.
      */
   public static void main(String[] args) 
                               throws FileNotFoundException {
      BunnyList bn = new BunnyList();   
      bn.readBunnyFile(args[0]);
      System.out.println(bn.summary() + "\n" + bn.listByName() + "\n"
                             + bn.listByCost() + "\n" 
                             + bn.getExcludedRecords());
   }
}
