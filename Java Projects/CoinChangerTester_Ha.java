//Benjamin Ha 
//TypesA2: Bell Market Coin Changer

public class CoinChangerTester_Ha
{
   public static void main(String [] args)
   {
      CoinChanger bellMarketCoinChanger = new CoinChanger(60,40,20,10);
      bellMarketCoinChanger.purchase(19.89,20.00);  
      System.out.println(bellMarketCoinChanger.toString());       
      
         
   }

}

class CoinChanger
{
   //Instance Variables
   private int quarters;
   private int dimes;
   private int nickels;
   private int pennies;
   private int quartersGiven;
   private int dimesGiven;
   private int nickelsGiven;
   private int penniesGiven;
   private double ogChange;
   
   
  
   public CoinChanger(int numQuarters, int numDimes, int numNickels, int numPennies)
   {
      quarters = numQuarters;
      dimes = numDimes;
      nickels = numNickels;
      pennies = numPennies;
      ogChange = 0;
      String pig = "pig";
      System.out.println(pig.substring(1,3));  
      
   }
   
   public void purchase(double totalSale, double amountGiven)
   {
     double changeNeeded = amountGiven - totalSale;
     ogChange = amountGiven - totalSale;
     quartersGiven = (int)(changeNeeded / 0.25);
     quarters = quarters - quartersGiven;
     changeNeeded = changeNeeded - (quartersGiven*0.25);
     dimesGiven = (int)(changeNeeded / 0.10);
     dimes = dimes - dimesGiven;
     changeNeeded = changeNeeded - (dimesGiven*0.10);
     nickelsGiven = (int)(changeNeeded / 0.05);
     nickels = nickels - nickelsGiven;
     changeNeeded = changeNeeded - (nickelsGiven*0.05);
     penniesGiven = (int)(changeNeeded / 0.01);
     pennies = pennies - penniesGiven;
     changeNeeded = changeNeeded - (penniesGiven*0.01);
     
     
     
         
   }
   public String toString()
   {
      
      return "Benjamin Ha\t Types A2 Bell Market Coin Changer"+"\nChange needed:"+
      ogChange+  "\nQuarters given:"+quartersGiven+
      "\nDimes given: "+dimesGiven+ "\nNickels given: "
      +nickelsGiven+"\nPennies given: "+penniesGiven + "\nQuarters left: "
      +quarters+"\nDimes left: "+dimes+"\nNickels left: "+nickels+
      "\nPennies left: "+pennies; 
   }
   
   
   
   
}
