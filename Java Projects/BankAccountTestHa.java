//Benjamin Ha
//3.9
//Bank Account
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccountTestHa{
   public static void main (String args[]){
      BankAccount account1 = new BankAccount();
      account1.setFee(0.15);
      account1.deposit(100);
      account1.withdraw(40);
      account1.withdraw(40);
      account1.deductMonthlyCharge();
      account1.deposit(100);
      account1.print();

   }
     


}
class BankAccount
{  
   private double balance;
   private double fee;
   private int freeTransaction = 2;
   private double amountOfFee;
   public BankAccount()
   {
      this.balance = 0;
      this.fee = setFee(0);
     
   }
   
   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      this.balance = this.balance + amount;
      this.freeTransaction = this.freeTransaction - 1;
      if (this.freeTransaction <0){
         this.amountOfFee = fee*balance;

      }
            
     
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      
      this.balance = this.balance - amount;
      this.freeTransaction = this.freeTransaction - 1;
      if (this.freeTransaction <0){
          this.amountOfFee = fee*balance;


      }
      
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   public double setFee(double fee)
   {
      return this.fee = fee;
      
   }
   public void deductMonthlyCharge(){
      if (freeTransaction <= 0) {
         this.freeTransaction = 2;
         this.balance = this.balance - this.amountOfFee;
         
      }
   
   }

  
   public void print()
   {
      
      System.out.println("Balance: " + getBalance());
   }
}
 