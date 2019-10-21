/**
 * OnlineArticle.
 *
 * Activity_09.
 * @author Boyang Yu
 * @version 04/02/2018
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * @param nameIn the name user give.
    * @param priceIn the price that user give.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
    * @param wordCountIn set wordcount.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}
