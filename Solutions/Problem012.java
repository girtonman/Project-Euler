//brute force. intentionally inefficient
//tried it without Math.sqrt and it never finished.
//loop count = 130722452
public class Problem012 {
   private static long loopCounter = 0;
   
   public static void main(String[] args) {
      int numFactors = 0;
      int number = 0;
      int triangleNumber = 0;
      int factorThresh = 500;
      
      while(numFactors <= 500) {
         triangleNumber++;
         number = 0;
         numFactors = 0;
         for(int i = 1; i <= triangleNumber; i++) {
            number += i;
            loopCounter++;
         }
         for(int i = 1; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
               numFactors += 2;
            loopCounter++;
         }
         if(Math.pow(Math.sqrt(number), 2) == number)
            numFactors--;
      }
      System.out.println("First triangle number with " + factorThresh + " factors is: " + number);
      System.out.println("This is the " + triangleNumber + "(st/nd/th) triangle number");
      System.out.println("Loop count: " + loopCounter);
   }
}