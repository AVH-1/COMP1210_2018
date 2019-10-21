/**
 * Online book.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * @param nameIn that user give name.
    * @param priceIn user give price.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
    * @return tostring.
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   /**
    * @param authorIn set.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}