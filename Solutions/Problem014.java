//rev 1
//brute force
//target answer = 837799
//old loop count = 132434271
//new loop count = 6226258
//~95% decrease in loop count

import java.util.HashMap;
import java.util.Map;

public class Problem014 {
   private static long loopCounter = 0;
   
   public static void main(String[] args) {
      int longestChain = 0;
      int longestChainStart = 0;
      long loopCounter = 0;
      int startingLimit = 1000000;
      Map<String, String> collatzCache = new HashMap<String, String>();
      
      for(int startingNumber = 1; startingNumber < startingLimit; startingNumber++) {
         long number = startingNumber;
         int chainCount = 1;
         
         while(number != 1){
            loopCounter++;
            String existing = collatzCache.get("" + number);
            if(existing != null) {
               chainCount += Integer.parseInt(existing) - 1;
               break;
            }
            if(number % 2 == 0)
               number = number / 2;
            else
               number = 3*(number) + 1;
            chainCount++;
         }
         
         collatzCache.put("" + startingNumber, "" + chainCount);
         if(number == 1)
            loopCounter++;
         if(chainCount > longestChain) {
            longestChain = chainCount;
            longestChainStart = startingNumber;
         }
      }
      
      System.out.println("Longest chain start: " + longestChainStart);
      System.out.println("Longest chain count: " + longestChain);
      System.out.println("Loop count: " + loopCounter);
   }
}