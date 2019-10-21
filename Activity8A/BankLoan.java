/**
 * contains a class with the same name.
 *
 *@author Boyang Yu
 *@version 03/19/2018
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
/**
 *@param customerNameIn customer name that user give.
 *@param interestRateIn interest rate that user give.
 */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
/**
 *@param amount amount that user give.
 *@return wasLoanMade rate that user give.
 */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**
 *@param amountPaid that user give.
 *@return amount paid.
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
/**
 *@return get balance.
 */
   public double getBalance() {
      return balance;
   }
/**
 *@param loan that user give.
 *@return boolean valeve. 
 */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
/**
 *@param amount user entrer.
 *@return if amount not 0.
 */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }

/**
 *@param interestRateIn interestRate user give.
 *@return if interestrare bigeer than 0.
 */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
/**
 *@return get interestrate.
 */
   
   public double getInterestRate() {
      return interestRate;
   }
   
/**
 *give valele.
 */

   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
/**
 *reset the loans created to 0.
 */
   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

/**
 *@return get loans created.
 */   

   public static int getLoansCreated() {
      return loansCreated;
   }

/**
 *@return to string.
 */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
